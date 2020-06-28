package com.ToyProject.account;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Account implements UserDetails{

//domain fileds (사용자의 개인정보)    
    private Integer USER_NO;

   


// security fields (인증에 필요한 정보)

    private String username;
    
    private String password;

    private Collection<? extends GrantedAuthority> authorities;



    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

    public Integer getUSER_NO() {
        return USER_NO;
    }

    public void setUSER_NO(Integer uSER_NO) {
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

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "Account [USER_NO=" + USER_NO + ", authorities=" + authorities + ", password=" + password + ", username="
                + username + "]";
    }

    




    
}