package com.ToyProject.account;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ToyProject.user.mapper.UserMapper;
import com.ToyProject.user.vo.TestVo;
import com.mysql.cj.protocol.Security;

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
        userVo.setUsername(username);
        userVo.setPassword("password");
        System.out.println(userVo); //kpkim이 들어간 객체 
        
        //if username이 db에 저장이 되있으면 repository에 저장해라 로직 구현
        Account buserVo=save(userVo);
        accounts.save(userVo); //현재 여기서 encode decode 에러가 남

        Account account= accounts.findByEmail(username); //여기서 에러가 나는듯.
        if (account==null){
            accounts.save(userVo);
        }
       
        
        

         UserDetails userDetails = new UserDetails() {

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
        acc.setUsername("kpkim");
        acc.setPassword("password");
        
        return accounts.selectAuthUser(acc);
	} 



}