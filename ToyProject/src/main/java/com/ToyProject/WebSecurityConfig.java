package com.ToyProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity // 스프링 시큐리티를 가능하게 하고 Spring MVC 연동을 제공하는 어노테이션.

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests() 
				
			 	.antMatchers("/").authenticated() //인증 받은 모두
				
				.antMatchers("/**").hasAuthority("ROLE_ADMIN") //특정 권한이 있을때만 접속가능한 url들
		
				.anyRequest().permitAll();// 전체 허용 ( css나 usercreate)
		http		
			.formLogin()
				.loginPage("/login")
				.permitAll();
		
		http		
			.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
			.logoutSuccessUrl("/") // 로그아웃 성공시
			.invalidateHttpSession(true);
		

				
	}









	@Bean
	public PasswordEncoder passwordEncoder(){

		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

}