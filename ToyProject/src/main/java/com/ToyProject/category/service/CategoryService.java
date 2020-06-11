package com.ToyProject.category.service;

import java.util.List;

import com.ToyProject.category.vo.CategoryVo;

public interface CategoryService {
    
    List<CategoryVo> selectCategoryHeaderList() throws Exception;

    List<CategoryVo> getCategoryList() throws Exception;

}