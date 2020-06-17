package com.ToyProject.main;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.ToyProject.user.service.UserService;

@Controller
public class Main {
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private UserService userService;
	
	//Constructor
	public Main() throws Exception {
		LOGGER.debug("\nConstructor :: "+this.getClass()+"\n");
	}

	@GetMapping("/")
	public String index(){
		return "index";
	}
	

}
