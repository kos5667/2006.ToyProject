package com.ToyProject.user.vo;

public class TestVo { 
    private int USER_NO; 
    private String USER_ID;
    private String PASSWORD;

    public int getUSER_NO() {
        return USER_NO;
    }

    public void setUSER_NO(int uSER_NO) {
        USER_NO = uSER_NO;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String uSER_ID) {
        USER_ID = uSER_ID;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String pASSWORD) {
        PASSWORD = pASSWORD;
    }

    @Override
    public String toString() {
        return "TestVo [PASSWORD=" + PASSWORD + ", USER_ID=" + USER_ID + ", USER_NO=" + USER_NO + "]";
    }

    

    
}
