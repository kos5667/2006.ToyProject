package com.ToyProject.product.service;

import java.util.List;

import com.ToyProject.product.vo.ProductVo;



public interface ProductService {
    
    	
	public void inserProduct(ProductVo productVO) throws Exception;
	public List<ProductVo> selectProduct(String productID) throws Exception;
}