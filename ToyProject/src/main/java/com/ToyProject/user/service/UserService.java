package com.ToyProject.user.service;

import com.ToyProject.user.vo.UserVO;

public interface UserService {
	
	public void insertUser() throws Exception;

	public UserVO selectUser(UserVO userVO) throws Exception;

	public void selectUserList() throws Exception;

	public void updateUser() throws Exception;
	
	public void deleteUser() throws Exception;

}
