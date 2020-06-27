package com.ToyProject.account;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Account implements UserDetails{

    /**
    	 *
    	 */
    private static final long serialVersionUID = -8919707875036977513L;

    // domain fileds (사용자의 개인정보)
    private Integer USER_NO;

   


// security fields (인증에 필요한 정보)

    private String username;
    
    private String password;

    private Collection<? extends GrantedAuthority> authorities;



    @Override
    public boolean isAccountNonExpired() {
        
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        
        return true;
    }

    @Override
    public boolean isEnabled() {
       
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