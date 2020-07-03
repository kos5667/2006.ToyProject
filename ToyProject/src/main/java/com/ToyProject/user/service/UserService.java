package com.ToyProject.user.service;

import java.util.List;

import com.ToyProject.user.vo.UserVO;

public interface UserService {
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
