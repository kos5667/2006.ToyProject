// package com.ToyProject.security.config;

// import java.nio.file.DirectoryStream.Filter;

// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.web.servlet.FilterRegistrationBean;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.configurers.oauth2.client.OAuth2ClientConfigurer;

// @Configuration
// @EnableOAuth2Client

// public class OAuthConfig {

//     private final OAuth2ClientConfigurer oauth2ClientContext;

//     public OAuthConfig(OAuth2ClientConfigurer oauth2ClientContext) {
//         this.oauth2ClientContext = oauth2ClientContext;
//     }

//     @Bean
//     public Filter ssoFilter() {
//         OAuth2ClientAuthenticationProcessingFilter oauth2Filter = new OAuth2ClientAuthenticationProcessingFilter("/login");
//         OAuth2RestTemplate oAuth2RestTemplate = new OAuth2RestTemplate(googleClient(), oauth2ClientContext);
//         oauth2Filter.setRestTemplate(oAuth2RestTemplate);
//         oauth2Filter.setTokenServices(new UserInfoTokenServices(googleResource().getUserInfoUri(), googleClient().getClientId()));

//         return oauth2Filter;
//     }

//     @Bean
//     @ConfigurationProperties("google.client")
//     public OAuth2ProtectedResourceDetails googleClient() {
//         return new AuthorizationCodeResourceDetails();
//     }

//     @Bean
//     @ConfigurationProperties("google.resource")
//     public ResourceServerProperties googleResource() {
//         return new ResourceServerProperties();
//     }

//     @Bean
//     public FilterRegistrationBean oauth2ClientFilterRegistration(OAuth2ClientContextFilter filter) {
//         FilterRegistrationBean registration = new FilterRegistrationBean();
//         registration.setFilter(filter);
//         registration.setOrder(-100);
//         return registration;
//     }
// }