package com.ToyProject.user.vo;

public class TestVo { 
    private Long mbrNo;
    private String id;
    private String name;

    @Override
    public String toString() {
        return "TestVo [id=" + id + ", mbrNo=" + mbrNo + ", name=" + name + "]";
    }

    public Long getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(Long mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
}
