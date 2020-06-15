package com.ToyProject.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * FileName : PojoAspectJ.java
 *	:: XML 에 선언적으로 aspect 의 적용   
  */
@Aspect
@Component
public class LogAspectJ {
	
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	///Constructor
	public LogAspectJ() {
		LOGGER.debug("\nCommon :: "+this.getClass()+"\n");
	}
	
	//Around  Advice
	@Around("execution(* com.ToyProject..*Controller.*(..))")
	//@Around("execution(* get*(..))")
	public Object invoke(ProceedingJoinPoint pJP)  {
		
		Object result = null;
        try {
            long start = System.currentTimeMillis();
            result = pJP.proceed();
            long end = System.currentTimeMillis();
            System.out.println("============================");
            System.out.println("메서드명 :"+ pJP.getSignature());
            System.out.println("수행 시간 : "+ (end - start));
            System.out.println("============================");
        } 
        catch (Throwable throwable) {
            System.out.println("exception! ");
        }
        return result;
	}
	
}//end of class