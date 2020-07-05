package com.ToyProject.user.web;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ToyProject.user.service.UserService;

@Controller
public class KakaoLoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/")
	public String index() {

		return "/user/loginUser";
	}

	//session bean 등록?
	@RequestMapping(value = "/user/loginKakao")
	public String login(@RequestParam("code") String code, HttpSession session) {
		System.out.println("=================controller=================");
		System.out.println("code : " + code);
		String access_Token = userService.getAccessToken(code);
		HashMap<String, Object> userInfo = userService.getUserInfo(access_Token);
		System.out.println("============================================");
		System.out.println("login Controller : " + userInfo);
		System.out.println("controller access_token : " + access_Token);

		// 클라이언트의 이메일이 존재할 때 세션에 해당 이메일과 토큰 등록
		if (userInfo.get("nickname") != null) {
			session.setAttribute("userId", userInfo.get("nickname"));
			session.setAttribute("access_Token", access_Token);
		}
		
		return "/user/selectUser";
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		userService.kakaoLogout((String) session.getAttribute("access_Token"));
		session.removeAttribute("access_Token");
		session.removeAttribute("userId");
		return "index";
	}
}
