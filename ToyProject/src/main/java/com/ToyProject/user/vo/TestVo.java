package com.ToyProject.user.vo;

public class TestVo { 
    private int USER_NO; 
    private String username;
    private String password;    
    private String role;

    public int getUSER_NO() {
        return USER_NO;
    }

    public void setUSER_NO(int uSER_NO) {
        USER_NO = uSER_NO;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "TestVo [USER_NO=" + USER_NO + ", password=" + password + ", role=" + role + ", username=" + username
                + "]";
    }


    

    

    
}
