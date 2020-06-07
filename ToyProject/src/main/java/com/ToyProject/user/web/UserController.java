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
	
	@RequestMapping(value="user/count", method=RequestMethod.GET)
	public String getUserCount(Model model){
		System.out.println("Controller 빈 정상작동");
		return "abc";
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
