package com.ToyProject.user.web;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ToyProject.user.service.UserService;
import com.ToyProject.user.vo.TestVo;

@Controller
public class UserController {

	@Resource(name = "UserService")
	UserService userService;
	
	@RequestMapping(value="/user/login", method=RequestMethod.GET)
	public String getUserCount(Model model){
		System.out.println("Controller 로그인 동작");
		
		return "thymeleaf/user/login";
	}
	@RequestMapping(value="/user/create",method = RequestMethod.GET)
	public String insertUser(Model model){
		System.out.println("Controller 유저 생성 동작");
		
		return "thymeleaf/user/userCreate";
	}


















	@RequestMapping("/thymeleafTest") 
	public String thymeleafTest(Model model) { 
		TestVo testModel = new TestVo() ; 
		testModel.setId("kpg707");
		testModel.setName("김국평");

		model.addAttribute("testModel", testModel); 
		return "thymeleaf/thymeleafTest"; 
	}

}
