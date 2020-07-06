package com.ToyProject.account;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;



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

        account.setUSER_NO(random.nextInt());
        accounts.put(account.getUsername(), account);
        sqlSession.insert("insertAccount",account);
       
        return account;

    }

    



    public Account findByEmail(String username) {
        System.out.println("username 받았고 뱉는건 accounts.get(username)이야.");
        return accounts.get(username);
    }

    
    public Account get(String username) {	
        return sqlSession.selectOne("getByusername", username);
    }


}