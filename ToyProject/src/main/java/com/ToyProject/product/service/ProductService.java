package com.ToyProject.product.service;

import java.util.List;
import java.util.Map;

import com.ToyProject.product.vo.ProductVo;





public interface ProductService {

    List<ProductVo> selectProductList(int categoryNo) throws Exception;
    

}
