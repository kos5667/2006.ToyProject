package com.ToyProject.user.web;

import java.util.List;

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

	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String getLoginform(Model model) {
		System.out.println("Controller 로그인 동작");

		return "thymeleaf/user/login";
	}

	@RequestMapping(value = "/user/form", method = RequestMethod.GET)
	public String getinsertUserform(Model model) {
		System.out.println("Controller 유저 생성 동작");

		return "thymeleaf/user/userCreate";
	}

	@RequestMapping(value = "/user/createuser", method = RequestMethod.GET)
	public void insertUser(TestVo userVO, Model model) {
		System.out.println(userVO);
		try {
			userService.insertUser(userVO);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}


/**
 * //id 값으로 먼저 아이디 있는지 확인
	//유효성검사
	//
 * @param userVO
 * @param model
 * 
 * 
 */
	
	@RequestMapping(value = "/user/selectuser", method = RequestMethod.POST)
	public String idCheck (TestVo userVO, Model model) throws Exception {
		//System.out.println(userVO+"시발럼아");

		String userID=userVO.getUSER_ID();
		//System.out.println(userID);
		List<TestVo> list= userService.selectUser(userID);
		//System.out.println(list);	
	
		
		
		//System.out.println("지금 아이디 넣으면 List 하나 가지고 오는것 까지 완료. 개굿");
		return "/";


	}




















}
