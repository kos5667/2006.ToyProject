package com.ToyProject.user.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public void insertUser() throws Exception;
	
	public void selectUser() throws Exception;

	public void selectUserList() throws Exception;

	public void updateUser() throws Exception;

	public void deleteUser() throws Exception;
	
	
}
