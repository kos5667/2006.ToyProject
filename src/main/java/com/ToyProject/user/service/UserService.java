package com.ToyProject.user.service;

import java.util.HashMap;
import java.util.List;

import com.ToyProject.user.vo.UserVO;

public interface UserService {
	/*
	 * 카카오 로그인 accessToken 받아오기
	 */
	public String getAccessToken(String authorize_code);
	/*
	 * 카카오 로그인 사용자 정보 받아오기
	 */
	public HashMap<String, Object> getUserInfo(String access_Token);
	/*
	 * 카카오 로그아웃
	 */
	public void kakaoLogout(String access_Token);
	/*
	 * 유저를 등록한다
	 */
	public void insertUser(UserVO vo) throws Exception;
	/*
	 * 유저를 조회한다
	 */
	public List<UserVO> selectUser(UserVO vo) throws Exception;
	/*
	 * 유저 목록을 조회한다
	 */
	public void selectUserList() throws Exception;
	/*
	 * 유저 정보를 수정한다
	 */
	public void updateUser() throws Exception;
	/*
	 * 유저 정보를 삭제한다(실제로 삭제하지 않고 컬럼 업데이드)
	 */
	public void deleteUser() throws Exception;

}
