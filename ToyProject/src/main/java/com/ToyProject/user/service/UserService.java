package com.ToyProject.user.service;

import java.util.List;

import com.ToyProject.user.vo.TestVo;

public interface UserService {
	
	
	public void insertUser(TestVo userVO) throws Exception;
	public List<TestVo> selectUser(String userID) throws Exception;
}
