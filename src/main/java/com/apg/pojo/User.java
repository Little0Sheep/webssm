package com.apg.pojo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer id;
    @NotEmpty(message="昵称不能为空")
    private String userName;
    @NotEmpty(message = "密码不能为空")
    @Length(min=6,max=16,message="密码长度不正确，得在6-16之间")
    private String userPswd;
    @NotEmpty(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String userEmail;

    @NotEmpty
    @Length(min=11,max=11)
    private String userPhone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPswd() {
        return userPswd;
    }

    public void setUserPswd(String userPswd) {
        this.userPswd = userPswd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPswd='" + userPswd + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone=" + userPhone +
                '}';
    }
}