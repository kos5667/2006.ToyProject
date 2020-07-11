package com.ToyProject.user.web;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ToyProject.user.service.UserService;


@Controller
public class UserController { 

	@Resource(name = "UserService")
	UserService userService;
	
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public String getLoginform(Model model){
		System.out.println("Controller 로그인 동작");
		
		return "thymeleaf/user/login";
	}
	@RequestMapping(value="/user/form",method = RequestMethod.GET)
	public String getinsertUserform(Model model){
		System.out.println("Controller 유저 생성 동작");
		
		return "thymeleaf/user/userCreate";
	}

	//@RequestMapping(value="/user/createuser")
	//public void insertUser(Model model)




















}
