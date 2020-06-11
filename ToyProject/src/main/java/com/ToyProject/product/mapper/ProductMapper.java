package com.ToyProject.product.mapper;

import java.util.List;

import com.ToyProject.product.vo.ProductVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    
    List<ProductVo> selectProductList(int categoryNo) throws Exception;

}