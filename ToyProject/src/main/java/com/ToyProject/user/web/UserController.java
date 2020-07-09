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

	@RequestMapping(value = "/user/login", method = RequestMethod.GET)
	public String getLoginform(Model model) {
		System.out.println("Controller 로그인 동작");

		return "/user/login";
	}






	@RequestMapping(value = "/user/form", method = RequestMethod.GET)
	public String getinsertUserform(Model model) {
		System.out.println("Controller 유저 생성 동작");

		return "/user/userCreate";
	}

	@RequestMapping(value = "/user/createuser", method = RequestMethod.GET)
	public void insertUser(TestVo userVO, Model model) {
		System.out.println(userVO+"////////////////////////////////////////////////");
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
	
/* 	@RequestMapping(value = "/user/selectuser", method = RequestMethod.POST)
	public String idCheck (TestVo userVO, Model model) throws Exception {
		

		String userID=userVO.getUSER_ID();
		List<TestVo> list= userService.selectUser(userID);

		// System.out.println(list.get(0).getUSER_ID());
		
		// System.out.println(list.get(1));
		
		// System.out.println(list.get(2));
		

		
		if(list.isEmpty()){
			System.out.println("아이디를 사용할수 있습니다.");
			
		}
		else{
			System.out.println(list);
			System.out.println("중복아이디가 있습니다.");
		}
	
		
		
		System.out.println("[] 면 데이터 없는거 , 아이디 중복되면 존나많이 가꼬옴. ");
		return "index";


	} */




















}
