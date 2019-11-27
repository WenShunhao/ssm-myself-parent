package com.control;

import com.dao.UserDao;
import com.entity.User;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class ProjectControl {

    @Autowired
    private UserDao dao;

    @InitBinder
    public void xxxx( WebDataBinder dataBinder) {

        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.setPattern("yyyy-MM-dd");
        dataBinder.addCustomFormatter(dateFormatter);
    }
    @RequestMapping("/lst")
    public ModelAndView test2(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("lst");
        req.setCharacterEncoding("UTF-8");
        Integer pageNum = Integer.valueOf(req.getParameter("pageNum"));
        Integer pageSize = Integer.valueOf(req.getParameter("pageSize"));
        List<User> all = dao.queryAll(pageNum, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(all,3);
        mv.addObject("list",pageInfo);
        return mv;

    }
//ajax
    @RequestMapping("/lst2")
    public String test2(int pageNum, int pageSize,Model model) throws UnsupportedEncodingException {
        List<User> all = dao.queryAll(pageNum, pageSize);
        PageInfo<User> pageInfo = new PageInfo<>(all,3);
        model.addAttribute("pageInfo",pageInfo);
        return "lst";

    }

    @RequestMapping("/insert")
    public ModelAndView test(@Valid User user, BindingResult bindingResult) throws Exception {
        ModelAndView mv = new ModelAndView();
        if (bindingResult.hasErrors()){
            List<FieldError> errors = bindingResult.getFieldErrors();
            for (FieldError error : errors) {
                mv.addObject(error.getField()+"Error",error.getDefaultMessage());
            }
            mv.setViewName("index");
        }else {

            dao.insertInfo(user);
            mv.setViewName("lst");
        }
        System.out.println(user);
        return mv;

    }

    @RequestMapping("/insert3")
    public ModelAndView test3() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;

    }


}
