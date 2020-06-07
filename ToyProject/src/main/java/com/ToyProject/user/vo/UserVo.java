package com.ToyProject.user.vo;

import java.util.Date;

public class UserVo {

    private int user_no; 
    private int user_id; 
    private String password; 
    private String name; 
    private String email; 
    private String phone;
    private String zcode;
    private String addr1; 
    private String addr2;
    private Date crt_dt;
    private Date upd_dt; 
    private String use_yn;
    private String auth_code;
    private int point;
    private int grade;

    public int getUser_no() {
        return user_no;
    }

    public void setUser_no(int user_no) {
        this.user_no = user_no;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public Date getCrt_dt() {
        return crt_dt;
    }

    public void setCrt_dt(Date crt_dt) {
        this.crt_dt = crt_dt;
    }

    public Date getUpd_dt() {
        return upd_dt;
    }

    public void setUpd_dt(Date upd_dt) {
        this.upd_dt = upd_dt;
    }

    public String getUse_yn() {
        return use_yn;
    }

    public void setUse_yn(String use_yn) {
        this.use_yn = use_yn;
    }

    public String getAuth_code() {
        return auth_code;
    }

    public void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "UserVo [addr1=" + addr1 + ", addr2=" + addr2 + ", auth_code=" + auth_code + ", crt_dt=" + crt_dt
                + ", email=" + email + ", grade=" + grade + ", name=" + name + ", password=" + password + ", phone="
                + phone + ", point=" + point + ", upd_dt=" + upd_dt + ", use_yn=" + use_yn + ", user_id=" + user_id
                + ", user_no=" + user_no + ", zcode=" + zcode + "]";
    }


    
}
