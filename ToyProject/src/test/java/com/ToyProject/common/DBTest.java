package com.ToyProject.common;

import javax.annotation.Resource;

import com.ToyProject.user.service.UserService;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.config.location = classpath:application.properties"})
public class DBTest {

	@Resource(name = "UserService")
	UserService userService;
	
	@Test
	public void connTest() throws Exception {
		userService.selectUser();
	}

}