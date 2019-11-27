import com.entity.User;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Date;
import java.util.List;

public class Test {
    @org.junit.Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = context.getBean(UserService.class);
        List<User> list = service.queryAll(1, 3);
        for (User user : list) {
            System.out.println("user = " + user);
        }
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService service = context.getBean(UserService.class);
//        User user = new User();
//        user.setId(22);
//        user.setUsername("haohao");
//        user.setPassword("123123");
//        user.setAge(19);
//        user.setBirthday(Date.valueOf("2000-10-09"));
//        user.setEmail("923134159@qq.com");
//        service.insertInfo(user);
    }
}
