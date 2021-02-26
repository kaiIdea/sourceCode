package com.example.modle;

/**
 * @Auther: GEEX1428
 * @Date: 2021/2/23 17:06
 * @Description:
 */
public class User {

    private String userName;

    private String email;

    private String loginName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
