package com.ToyProject.account;

import org.springframework.core.MethodParameter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;


public class AuthUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public Object resolveArgument(
        MethodParameter parameter, 
        ModelAndViewContainer mavContainer,
        NativeWebRequest webRequest, 
        WebDataBinderFactory binderFactory) throws Exception {

        Object principal = null;

        //SecurityContextHolder에 갖고 있는 인증정보를 확인한다. -> SuccessHandler을 실행할것
        //SecurityContext
        //Authentication

            //Annotation @AuthUser을 통해서 인증이 필요한 메서드에서 사용하면 Account 도메인 객체를 1차적으로 인증정보를 holder에 포함하고 있는지 검증
            

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if(authentication != null ) {
            principal = authentication.getPrincipal();
        }

        if(principal == null || principal.getClass() == String .class) {
            return null;
        }

        return principal;
    }

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        AuthUser authUser = parameter.getParameterAnnotation(AuthUser.class);
        if(authUser==null) {
            return false;
        }

        if(parameter.getParameterType().equals(Account.class)==false) { 
            return false;
        }
        
        return true;
    }
}