package com.ToyProject.category.web;

import java.util.List;

import javax.annotation.Resource;

import com.ToyProject.category.service.CategoryService;
import com.ToyProject.category.vo.CategoryVo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoryController {
    
    @Resource(name="CategoryService")
    CategoryService categoryService;

    @ResponseBody
    @RequestMapping(value = "/category/header", method = RequestMethod.GET)
	public List<CategoryVo> selectCategoryHeaderList(Model model) throws Exception {
        List<CategoryVo> list=categoryService.selectCategoryHeaderList();
        System.out.println("CategoryList:"+list.toString());

		return list;
    }
    
    // @RequestMapping(value = "/category/list", method = RequestMethod.GET)
	// public List<CategoryVo> selectCategoryHeaderList(Model model) throws Exception {
    //     List<CategoryVo> list=categoryService.selectCategoryHeaderList();
    //     System.out.println("CategoryList:"+list.toString());

	// 	return list;
	//}

}