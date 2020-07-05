package com.ToyProject;

import java.security.AuthProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	AuthProvider authProvider;



    @Override
	public void configure(WebSecurity web) throws Exception
	{
		//  항상통과 
		web.ignoring().antMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/", "/user/loginUser", "/user/loginKakao");
	}
    
    @Override
  	protected void configure(HttpSecurity http) throws Exception {
	  	http.csrf().disable();
	  	http.httpBasic()
			.and()
			.authorizeRequests()
			// 어떤 요청이든지 인증되어야함.
			// .anyRequest().authenticated() 
				.antMatchers("/user/**").access("ROLE_USER")				// 사용자 페이지
				.antMatchers("/admin/**").access("ROLE_ADMIN")				// 관리자 페이지
				.antMatchers("/login").permitAll()
				.antMatchers("/**").authenticated()
			.and()
			.formLogin()
				.loginPage("/user/loginUser")
				.usernameParameter("email")
				.passwordParameter("password")
				.permitAll();
	  	
	  	// 직접 class(AuthProvider)를 작성하여 이 클래스를 통해 인증 할 때
	  	// (AuthProvider에서는 Serviec를 호출하고 MyBatis와 연동)
	  	//	http.authenticationProvider((AuthenticationProvider) authProvider);

  }
}
