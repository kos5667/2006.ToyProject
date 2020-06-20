package com.ToyProject.user.vo;

import java.util.Date;

public class UserVo {
    
    private int userNo;      /*회원 일련번호*/
    private String userId;      /*회원 아이디*/
    private String password;    /*회원 비밀번호*/
    private String name;        /*회원 이름*/
    private String email;       /*회원 이메일*/
    private String phone;       /*회원 전화번호*/
    private String zcode;       /*우편번호*/
    private String addr1;       /*주소2*/
    private String addr2;       /*주소3*/
    private Date crtDt;       /*생성일시*/
    private Date updDt;       /*수정일시*/
    private String useYn;       /*사용여부*/
    private String authCode;    /*권한(유저, 어드민)*/
    private int point;       /*포인트 보유금액*/
    private String grade;       /*회원등급*/


    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZcode() {
        return zcode;
    }

    public void setZcode(String zcode) {
        this.zcode = zcode;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public Date getCrtDt() {
        return crtDt;
    }

    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }

    public Date getUpdDt() {
        return updDt;
    }

    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "UserVo [addr1=" + addr1 + ", addr2=" + addr2 + ", authCode=" + authCode + ", crtDt=" + crtDt
                + ", email=" + email + ", grade=" + grade + ", name=" + name + ", password=" + password + ", phone="
                + phone + ", point=" + point + ", updDt=" + updDt + ", useYn=" + useYn + ", userId=" + userId
                + ", userNo=" + userNo + ", zcode=" + zcode + "]";
    }
}
