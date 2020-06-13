package com.ToyProject.product.mapper;

import java.util.List;

import com.ToyProject.category.vo.CategoryVo;
import com.ToyProject.product.vo.ProductVo;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ProductMapper {
    
    List<ProductVo> selectProductList(List<CategoryVo> categoryList) throws Exception;

}