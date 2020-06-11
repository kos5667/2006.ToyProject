package com.ToyProject.category.service.impl;

import java.util.List;

import com.ToyProject.category.mapper.CategoryMapper;
import com.ToyProject.category.service.CategoryService;
import com.ToyProject.category.vo.CategoryVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CategoryService")
public class CategoryServiceImpl implements CategoryService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Autowired
    CategoryMapper categoryMapper;

    public List<CategoryVo> selectCategoryHeaderList() throws Exception {
       return categoryMapper.selectCategoryHeaderList();
    }

    @Override
    public List<CategoryVo> getCategoryList() throws Exception {
        return categoryMapper.getCategoryList();
    }
    
}