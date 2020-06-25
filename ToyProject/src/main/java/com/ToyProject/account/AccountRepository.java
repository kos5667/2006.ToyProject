package com.ToyProject.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.ToyProject.user.vo.TestVo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    @Autowired 
    SqlSession sqlSession;


    private Map<String, Account> accounts = new HashMap<>();
    private Random random = new Random();

    public Account save(Account account) {

        account.setId(random.nextInt());
        accounts.put(account.getEmail(), account);
        return account;

    }

    public Account findByEmail(String username) {
        return accounts.get(username);
    }

    public TestVo get(String email) {
        return sqlSession.selectOne("user.getByEmail", email);
    }

}