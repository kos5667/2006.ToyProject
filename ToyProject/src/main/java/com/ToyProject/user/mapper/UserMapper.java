package com.ToyProject.user.mapper;

import java.util.Map;

import com.ToyProject.user.vo.UserVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	void insertUser(UserVo user);
	
	Map <String,Object> selectUser() throws Exception;
	
}
