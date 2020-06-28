package com.ToyProject.account;

import java.util.ArrayList;
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
    private  AccountRepository accounts;
    @Autowired
    private  PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
         Account account = accounts.findByEmail(username); //레포지토리에 accounts에 데이터가 있으면, 자동적으로 셋팅됨.
        if(account==null){ //레포지토리에 account가 없을 경우: 방법 1 
            //
            System.out.println("null일 경우에는////////////////"+account);

        }
        

       
       //null일경우 db에서 select해서 동기화 시켜야되는데 못하겠음.


       
        
        

        final UserDetails userDetails = new UserDetails() {

            /**
             *
             */
            private static final long serialVersionUID = 9131110532540045617L;

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List <GrantedAuthority> authorities= new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority("ADMIN_ROLE"));
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

	public Account selectAuthUser(Account acc) {
        
        System.out.println(acc);
        return accounts.selectAuthUser(acc);
	} 



}