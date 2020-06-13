package com.ToyProject.category.web;

import java.util.List;

import javax.annotation.Resource;

import com.ToyProject.category.service.CategoryService;
import com.ToyProject.category.vo.CategoryVo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoryController {
    
    @Resource(name="CategoryService")
    CategoryService categoryService;

    @ResponseBody
    @RequestMapping(value = "/category/list", method = RequestMethod.GET)
	public List<CategoryVo> selectCategoryList(Model model, @RequestParam("categoryNo") int categoryNo) throws Exception {
        List<CategoryVo> list=categoryService.selectCategoryList(categoryNo);
        System.out.println("CategoryList:"+list.toString());

		return list;
    }
    
    @ResponseBody
    @RequestMapping(value = "/category/listNo", method = RequestMethod.GET)
	public List<CategoryVo> getCategoryList(Model model) throws Exception {
        int categoryNo=1;
        List<CategoryVo> list=categoryService.getCategoryList(categoryNo);
        System.out.println("CategoryList:"+list.toString());

		return list;
	}

}