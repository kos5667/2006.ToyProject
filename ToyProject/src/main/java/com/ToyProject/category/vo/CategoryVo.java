package com.ToyProject.category.vo;

import java.sql.Date;

public class CategoryVo {
    private int category_no;
    private String name;
    private String top_id;
    private String up_id;
    private String depth;
    private String use_yn;
    private Date crt_dt;

    public int getCategory_no() {
        return this.category_no;
    }

    public void setCategory_no(int category_no) {
        this.category_no = category_no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTop_id() {
        return this.top_id;
    }

    public void setTop_id(String top_id) {
        this.top_id = top_id;
    }

    public String getUp_id() {
        return this.up_id;
    }

    public void setUp_id(String up_id) {
        this.up_id = up_id;
    }

    public String getDepth() {
        return this.depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getUse_yn() {
        return this.use_yn;
    }

    public void setUse_yn(String use_yn) {
        this.use_yn = use_yn;
    }

    public Date getCrt_dt() {
        return this.crt_dt;
    }

    public void setCrt_dt(Date crt_dt) {
        this.crt_dt = crt_dt;
    }

    public String toString(){
        return "카테고리:"+name;
    }

}