package com.ToyProject.main;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ToyProject.user.service.UserService;

@Controller
@RequestMapping(value = "/main/*")
public class Main {
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="UserService")
	private UserService userService;
	
	//Constructor
	public Main() throws Exception {
		LOGGER.debug("\nConstructor :: "+this.getClass()+"\n");
	}
	
	//Method
	@RequestMapping(value="mainPage", method=RequestMethod.GET)
	public String mainPage() {
		try {
			LOGGER.debug("\nmainPage debug:: "+this.getClass()+"\n");
			LOGGER.info("\nmainPage info:: "+this.getClass()+"\n");
			LOGGER.trace("\nmainPage trace:: "+this.getClass()+"\n");
			LOGGER.error("\nmainPage error:: "+this.getClass()+"\n");
		} catch (NullPointerException e) {
			LOGGER.error("mainPage NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("mainPage IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("mainPage Exception : " + e.getMessage());
		}
		return "index.html";
	}
}
