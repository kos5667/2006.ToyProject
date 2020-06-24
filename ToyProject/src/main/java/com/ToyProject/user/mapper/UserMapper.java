package com.ToyProject.user.mapper;

import com.ToyProject.user.vo.UserVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public void insertUser() throws Exception;
	
	public UserVO selectUser(UserVO userVO) throws Exception;

	public void selectUserList() throws Exception;

	public void updateUser() throws Exception;

	public void deleteUser() throws Exception;
	
}
