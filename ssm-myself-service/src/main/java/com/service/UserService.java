package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService   {
    @Autowired
    private UserDao dao;

    public void insertInfo(User user){
        dao.insertInfo(user);
    }
    @Transactional
    public List<User> queryAll(int pageNum,int pageSize){
        return dao.queryAll(pageNum,pageSize);
    }
@Transactional
    public String selectByname(String username){
        return  dao.selectByname(username);
    }
}
