package com.entity;

import com.customs.IsNotNull;
import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Date;

public class User {
    private Integer id;
    @IsNotNull(message = "*this values is not null!!!!!!")
    private String username;
    @Length(min = 3,max = 20,message = "*the password's length should be between 3 and 20!!!")
    private String password;
    @Min(value = 0,message = "the age  is >=0!!!")
    private Integer age;
    @Past(message = "the date should be before today!!!")
    @NotNull
    private Date birthday;
    @Email(message = "email's formmter is not true!!!")
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, Date birthday, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }

}
