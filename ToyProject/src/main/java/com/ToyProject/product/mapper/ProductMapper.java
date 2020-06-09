package com.ToyProject.product.mapper;

import java.util.List;

import com.ToyProject.product.vo.CategoryVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    
    List<CategoryVo> getCategoryList() throws Exception;

}