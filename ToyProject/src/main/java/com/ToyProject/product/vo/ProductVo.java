package com.ToyProject.product.vo;

public class ProductVo {
    private int PRODUCT_NO; 
    private String name;
    private String price;    
    private String cnt;
    private String image_path;

    public int getPRODUCT_NO() {
        return PRODUCT_NO;
    }

    public void setPRODUCT_NO(int pRODUCT_NO) {
        PRODUCT_NO = pRODUCT_NO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    @Override
    public String toString() {
        return "ProductVo [PRODUCT_NO=" + PRODUCT_NO + ", cnt=" + cnt + ", image_path=" + image_path + ", name=" + name
                + ", price=" + price + "]";
    }
}