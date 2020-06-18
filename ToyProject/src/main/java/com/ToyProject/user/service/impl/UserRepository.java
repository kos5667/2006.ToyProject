package com.ToyProject.user.service.impl;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import com.ToyProject.user.vo.TestVo;

import org.springframework.stereotype.Repository;




/**
 *  UserRepository - 랜덤으로 아이디를 생성 하고 
 *  메일, Password를 설정해줌.
 *  Service에서 레포지토리에 요청 하는 방식
 * 
 * 
 */


@Repository
public class UserRepository {

    private Map<String, TestVo> accounts= new HashMap<>();

    private Random random = new Random();

    int a = random.nextInt();
  
    
    



}
