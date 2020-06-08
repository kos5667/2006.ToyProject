package com.ToyProject.user.mapper;

import java.util.List;
import java.util.Map;
import com.ToyProject.user.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	void insertUser(TestVo userVo);
	List<TestVo> selectUser(String userID) throws Exception;
	
}
