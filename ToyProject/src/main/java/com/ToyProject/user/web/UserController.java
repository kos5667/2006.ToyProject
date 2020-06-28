package com.ToyProject.user.web;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ToyProject.user.service.UserService;


@Controller
@RequestMapping(value="/user/*")
public class UserController {
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name = "UserService")
	UserService userService;

	//Constructor
	public UserController() throws Exception {
		LOGGER.debug("\nConstructor :: "+this.getClass()+"\n");
	}

	//Method
	@RequestMapping(value="loginUserView", method=RequestMethod.GET)
	public String loginUserView() {
		try {
		} catch (NullPointerException e) {
			LOGGER.error("loginUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("loginUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("loginUser Exception : " + e.getMessage());
		}
		return "/user/loginUser.html";
	}

	@RequestMapping(value="loginUser", method=RequestMethod.GET)
	public String loginUser() {
		try {
			
		} catch (NullPointerException e) {
			LOGGER.error("loginUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("loginUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("loginUser Exception : " + e.getMessage());
		}
		return "";
	}

	@RequestMapping(value="insertUserView", method=RequestMethod.GET)
	public String insertUserView() {
		try {
		} catch (NullPointerException e) {
			LOGGER.error("insertUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("insertUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("insertUser Exception : " + e.getMessage());
		}
		return "/user/insertUser.html";
	}

	@RequestMapping(value="insertUser", method=RequestMethod.GET)
	public String insertUser() {
		try {
		} catch (NullPointerException e) {
			LOGGER.error("insertUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("insertUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("insertUser Exception : " + e.getMessage());
		}
		return "";
	}

	@RequestMapping(value="selectUser", method=RequestMethod.GET)
	public String selectUser() {

		try {
			
		} catch (NullPointerException e) {
			LOGGER.error("selectUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("selectUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("selectUser Exception : " + e.getMessage());
		}
		return "";
	}

	@RequestMapping(value="selectUserList", method=RequestMethod.GET)
	public String selectUserList() {

		try {
			
		} catch (NullPointerException e) {
			LOGGER.error("selectUserList NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("selectUserList IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("selectUserList Exception : " + e.getMessage());
		}
		return "";
	}

	@RequestMapping(value="updateUser", method=RequestMethod.GET)
	public String updateUser() {

		try {
			
		} catch (NullPointerException e) {
			LOGGER.error("updateUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("updateUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("updateUser Exception : " + e.getMessage());
		}
		return "";
	}

	@RequestMapping(value="deleteUser", method=RequestMethod.GET)
	public String deleteUser() {

		try {
			
		} catch (NullPointerException e) {
			LOGGER.error("deleteUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("deleteUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("deleteUser Exception : " + e.getMessage());
		}
		return "";
	}




















}
