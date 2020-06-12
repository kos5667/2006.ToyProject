package com.ToyProject.product.service;

import java.util.List;
import java.util.Map;

import com.ToyProject.category.vo.CategoryVo;
import com.ToyProject.product.vo.ProductVo;





public interface ProductService {

    List<ProductVo> selectProductList(List<CategoryVo> categoryList) throws Exception;
    

}
