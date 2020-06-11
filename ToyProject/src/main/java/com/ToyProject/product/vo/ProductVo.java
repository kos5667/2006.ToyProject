package com.ToyProject.product.vo;

import java.util.Date;

public class ProductVo {
    int product_no;
    String name;
    String price;
    String author;
    String publisher;
    String status;
    int category_no;
    String cnt;
    String detail;
    String image_path;
    int grade;
    String thumbnail_path;
    int stock;
    Date crt_dt;

    public int getProduct_no() {
        return this.product_no;
    }

    public void setProduct_no(int product_no) {
        this.product_no = product_no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCategory_no() {
        return this.category_no;
    }

    public void setCategory_no(int category_no) {
        this.category_no = category_no;
    }

    public String getCnt() {
        return this.cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage_path() {
        return this.image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getThumbnail_path() {
        return this.thumbnail_path;
    }

    public void setThumbnail_path(String thumbnail_path) {
        this.thumbnail_path = thumbnail_path;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCrt_dt() {
        return this.crt_dt;
    }

    public void setCrt_dt(Date crt_dt) {
        this.crt_dt = crt_dt;
    }

}