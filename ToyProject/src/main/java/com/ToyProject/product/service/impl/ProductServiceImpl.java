package com.ToyProject.product.service.impl;

import java.util.List;
import java.util.Map;

import com.ToyProject.category.mapper.CategoryMapper;
import com.ToyProject.category.vo.CategoryVo;
import com.ToyProject.product.mapper.ProductMapper;
import com.ToyProject.product.service.ProductService;
import com.ToyProject.product.vo.ProductVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductMapper productMapper;

 

    @Override
    public List<ProductVo> selectProductList(List<CategoryVo> categoryList) throws Exception {
       
        return productMapper.selectProductList(categoryList);
    }
    

}