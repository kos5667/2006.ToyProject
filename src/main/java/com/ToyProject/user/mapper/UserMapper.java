package com.ToyProject.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ToyProject.user.vo.UserVO;

@Mapper
public interface UserMapper {

	// 유저를 등록한다
	public void insertUser(UserVO vo) throws Exception;
	
	public List<UserVO> selectUser(UserVO vo) throws Exception;

	public void selectUserList() throws Exception;

	public void updateUser() throws Exception;

	public void deleteUser() throws Exception;
	
}
