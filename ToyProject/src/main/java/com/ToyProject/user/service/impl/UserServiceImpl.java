package com.ToyProject.user.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToyProject.user.mapper.UserMapper;
import com.ToyProject.user.service.UserService;
import com.ToyProject.user.vo.TestVo;

@Service("UserService")
public class UserServiceImpl implements UserService {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

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
