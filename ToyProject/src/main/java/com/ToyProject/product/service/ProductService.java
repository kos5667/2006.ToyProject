package com.ToyProject.product.service;

import java.util.List;
import java.util.Map;

import com.ToyProject.product.vo.CategoryVo;



public interface ProductService {

    public List<CategoryVo> getCategoryList() throws Exception;

}
