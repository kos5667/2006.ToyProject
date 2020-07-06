package com.ToyProject.account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {

    @Autowired
    private AccountRepository accounts;
    @Autowired
    private PasswordEncoder passwordEncoder;

  
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 레포지토리에 accounts에 데이터가 있으면, 자동적으로 셋팅됨.
        // Account account = accounts.findByEmail(username);
        System.out.println(username); //kpkim
        Account userVo=new Account();
        Account account= new Account(); //인증 
        userVo=accounts.get(username);//에러났다.

        System.out.println(userVo);
        if(userVo!=null){
            account.setUSER_NO(userVo.getUSER_NO());
            account.setUsername(userVo.getUsername());
            account.setPassword(userVo.getPassword());
            account.setAuthorities(userVo.getAuthorities());
        }

        System.out.println(account);
        System.out.println(account.getAuthorities());
       
        
         UserDetails userDetails = new UserDetails() {

            /**
             *
             */
            private static final long serialVersionUID = 9131110532540045617L;

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List <GrantedAuthority> authorities= new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
                    return authorities;
            }

            @Override
            public String getPassword() {
                
                return account.getPassword();
            }

            @Override
            public String getUsername() {
                
                return account.getUsername();
            }

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



        };

        return userDetails;
    }

	public Account save(Account acc) {
        acc.setPassword(passwordEncoder.encode(acc.getPassword()));
        return accounts.save(acc);
	}





}