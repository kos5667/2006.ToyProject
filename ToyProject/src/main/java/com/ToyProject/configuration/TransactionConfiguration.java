package com.ToyProject.configuration;

import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;
import org.springframework.transaction.interceptor.RollbackRuleAttribute;
import org.springframework.transaction.interceptor.RuleBasedTransactionAttribute;
import org.springframework.transaction.interceptor.TransactionInterceptor;

@Configuration

public class TransactionConfiguration {

    @Autowired
    private PlatformTransactionManager platformTransactionManager;

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private static final int TX_METHOD_TIMEOUT = 3;

    @Bean
	public TransactionInterceptor transactionAdvice() {
        TransactionInterceptor txAdvice = new TransactionInterceptor();

        Properties txAttributes = new Properties();

        // write rollback-rule
        //트랜잭션에서 롤백을 수행하는 규칙(Rule). RollbackRuleAttribute 생성자의 인자로 Exception 클래스를 지정,
        //자바에서 모든 예외는 Exception 클래스를 상속받기 때문에 어떠한 예외가 발생하던 무조건 롤백이 수행됨.
        List<RollbackRuleAttribute> rollbackRules = Collections.singletonList(new RollbackRuleAttribute(Exception.class));

        //트랜잭션 롤백을 유발하는지 여부를 해결하는 TransactionAttribute 구현
		RuleBasedTransactionAttribute transactionAttribute = new RuleBasedTransactionAttribute();
        transactionAttribute.setRollbackRules(rollbackRules);
        //트랜잭션의 이름을 설정. 트랜잭션 모니터에서 트랜잭션의 이름으로 확인이 가능
		transactionAttribute.setName("*");

        // read-only
        DefaultTransactionAttribute readOnlyAttribute = new DefaultTransactionAttribute(TransactionDefinition.PROPAGATION_REQUIRED);
        readOnlyAttribute.setReadOnly(true);
        readOnlyAttribute.setTimeout(TX_METHOD_TIMEOUT);

        String readOnlyTransactionAttributesDefinition = readOnlyAttribute.toString();

        String writeTransactionAttributesDefinition = transactionAttribute.toString();

        LOGGER.info("Read Only Attributes :: {}", readOnlyTransactionAttributesDefinition);

		LOGGER.info("Write Attributes :: {}", writeTransactionAttributesDefinition);

        //MatchAlwaysTransactionAttributeSource attributeSource = new MatchAlwaysTransactionAttributeSource();
		//attributeSource.setTransactionAttribute(transactionAttribute);

        //set write rollback-rule
        txAttributes.setProperty("insert*", writeTransactionAttributesDefinition);
        txAttributes.setProperty("update*", writeTransactionAttributesDefinition);
        //set read-only
        txAttributes.setProperty("select*", readOnlyTransactionAttributesDefinition);

        txAdvice.setTransactionAttributes(txAttributes);
        txAdvice.setTransactionManager(platformTransactionManager);
		return txAdvice;
    }

	@Bean
	public Advisor transactionAdviceAdvisor() {
		AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
		pointcut.setExpression("execution(* com.ToyProject..service.impl.*Impl.*(..) )");
		return new DefaultPointcutAdvisor(pointcut, transactionAdvice());
    }


}