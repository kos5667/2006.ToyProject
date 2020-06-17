package com.ToyProject.user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ToyProject.user.mapper.UserMapper;
import com.ToyProject.user.service.UserService;
import com.ToyProject.user.vo.TestVo;

@Service("UserService")
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserMapper userMapper;

	@Override
	public List<TestVo> selectUser(String userID) throws Exception {
		return userMapper.selectUser(userID);
	}

	@Override
	public void insertUser(TestVo userVO) throws Exception {
		userMapper.insertUser(userVO);
	}


}
