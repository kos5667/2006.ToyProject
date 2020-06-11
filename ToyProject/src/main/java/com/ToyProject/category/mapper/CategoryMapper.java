package com.ToyProject.category.mapper;

import java.util.List;

import com.ToyProject.category.vo.CategoryVo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

    List<CategoryVo> selectCategoryHeaderList() throws Exception;
}