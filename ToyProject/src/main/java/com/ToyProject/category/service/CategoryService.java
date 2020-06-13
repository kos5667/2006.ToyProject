package com.ToyProject.category.service;

import java.util.List;

import com.ToyProject.category.vo.CategoryVo;

public interface CategoryService {
    
    List<CategoryVo> selectCategoryList(int categoryNo) throws Exception;

    List<CategoryVo> getCategoryList(int categoryNo) throws Exception;

}