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
        final Account account = accounts.findByEmail(username);
        System.out.println("hello");

        final UserDetails userDetails = new UserDetails() {

            /**
             *
             */
            private static final long serialVersionUID = 9131110532540045617L;

            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
            List <GrantedAuthority> authorities= new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ADMIN_ROLE"));
          
            System.out.println(authorities);
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