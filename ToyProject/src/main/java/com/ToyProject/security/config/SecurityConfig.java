// package com.ToyProject.security.config;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http.antMatcher("/**")
//                 .authorizeRequests()
//                 .antMatchers("/", "/h2-console/**", "/favicon.ico","/user/login","/user/form","**").permitAll() //url 접속을 허용해주는 코드
//                 .anyRequest().authenticated()
//                 .and().logout().logoutSuccessUrl("/").permitAll()
//                 .and().headers().frameOptions().sameOrigin()
//                 .and().csrf().disable();
//     }
// }