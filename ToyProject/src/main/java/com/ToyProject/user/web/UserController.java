package com.ToyProject.user.web;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ToyProject.user.service.UserService;
import com.ToyProject.user.vo.UserVO;

@Controller
@RequestMapping(value="/user/*")
public class UserController {
	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	HttpSession session;

	@Resource(name = "UserService")
	UserService userService;

	//Constructor
	public UserController() throws Exception {
		LOGGER.debug("\nConstructor :: "+this.getClass()+"\n");
	}

	// Method
	@RequestMapping(value="loginUser.do", method=RequestMethod.GET)
	public String loginUserView() {
		try {
		} catch (NullPointerException e) {
			LOGGER.error("loginUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("loginUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("loginUser Exception : " + e.getMessage());
		}
		return "/user/loginUser";
	}

	@RequestMapping(value="insertUser.do", method=RequestMethod.GET)
	public String insertUserView() {
		try {

		} catch (NullPointerException e) {
			LOGGER.error("insertUser NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("insertUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("insertUser Exception : " + e.getMessage());
		}
		return "/user/insertUser";
	}

	@ResponseBody
	@RequestMapping(value="insertUser", method=RequestMethod.POST)
	public ResponseEntity<Object> insertUser(@ModelAttribute UserVO vo) {
		ResponseEntity<Object> res = null;
		try {
			// 아이디 패스워드 널 체크
			if ((vo.getUserId() == null || vo.getUserId().equals(""))
					|| (vo.getPassword() == null || vo.getPassword().equals(""))) {
				throw new NullPointerException("Esential Variable is ommited");
			}

			// 생성일자 설정
			vo.setCrtDt(new Date());
			// 수정일자 설정
			vo.setUpdDt(new Date());

			userService.insertUser(vo);
			res = new ResponseEntity<>("200", HttpStatus.OK);
		} catch (NullPointerException e) {
			LOGGER.error("insertUser NullPointerException : " + e.getMessage());
			res = new ResponseEntity<>("400", HttpStatus.BAD_REQUEST);
			return res;
		} catch (IllegalArgumentException e) {
			LOGGER.error("insertUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("insertUser Exception : " + e.getMessage());
			res = new ResponseEntity<>("503", HttpStatus.SERVICE_UNAVAILABLE);
			return res;
		}
		return res;
	}

	@ResponseBody
	@RequestMapping(value="selectUser", method=RequestMethod.POST)
	public ResponseEntity<Object> selectUser(@ModelAttribute UserVO vo) {
		ResponseEntity<Object> res = null;
		// 유저 리스트
		List<UserVO> user_list = null;

		try {
			// 아이디 널 체크
			if (vo.getUserId() == null || vo.getUserId().equals("")) {
				throw new NullPointerException("Esential Variable is ommited");
			}
			// https://showbang.github.io/typistShow/2017/04/11/nullCheck/
			/*
			test변수가 null이나 nullString이 아닐 때 로직을 타게 되어있습니다.
			그런데 이렇게 if문을 짠후 로직을 돌리면 null값이 로직에 들어가 에러가 납니다.
			이때는 if문에서 null체크를 먼저 해주면서 에러를 방지할 수 있습니다.
			 */
			LOGGER.info("user 정보 출력 : " + user_list);
			res = new ResponseEntity<Object>(user_list, HttpStatus.OK);
		} catch (NullPointerException e) {
			LOGGER.error("selectUser NullPointerException : " + e.getMessage());
			res = new ResponseEntity<>("400", HttpStatus.BAD_REQUEST);
			return res;
		} catch (IllegalArgumentException e) {
			LOGGER.error("selectUser IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("selectUser Exception : " + e.getMessage());
			res = new ResponseEntity<>("503", HttpStatus.SERVICE_UNAVAILABLE);
			return res;
		}
		return res;
	}

	@RequestMapping(value="selectUserList", method=RequestMethod.POST)
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

	@RequestMapping(value="updateUser", method=RequestMethod.POST)
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

	@RequestMapping(value="deleteUser", method=RequestMethod.POST)
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

	@RequestMapping(value="naverLoginCallBack.do")
	public String naverLoginCallback() {
		// 네이버 로그인 콜백 페이지로 이동한다
		return "user/naverLoginCallback";
	}

}
