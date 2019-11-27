package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> queryAll(@Param("pageNum") int pageNum,@Param("pageSize")int pageSize);
    void insertInfo(User user);
    String  selectByname(@Param("username") String username);
}
