package com.ToyProject.product.web;

import java.util.List;

import javax.annotation.Resource;

import com.ToyProject.product.service.ProductService;
import com.ToyProject.product.vo.CategoryVo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Resource(name = "ProductService")
    ProductService productService;
    
    @RequestMapping(value = "/testPage", method = RequestMethod.GET)
	public String testPage(Model model) throws Exception {
        List<CategoryVo> list=productService.getCategoryList();
        System.out.println("CategoryList:"+list.toString());

		return "/product/test";
	}

    @ResponseBody
    @RequestMapping(value = "/product/test", method = RequestMethod.GET)
	public List<CategoryVo> getinsertUserform(Model model) throws Exception {
        List<CategoryVo> list=productService.getCategoryList();
        System.out.println("CategoryList:"+list.toString());

		return productService.getCategoryList();
	}
}