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
        
        return accounts.get(username);
    }





	public Account selectAuthUser(Account account) {
        
        sqlSession.selectList("selectAccount", account);
        if(account!=null){
            accounts.put(account.getUsername(),account);
        }
        else{
            System.out.println("error 발생! account값이 null입니다.");
        }
        return account;
	}



}