package com.ToyProject.product.web;

import java.util.List;

import javax.annotation.Resource;

import com.ToyProject.category.service.CategoryService;
import com.ToyProject.category.vo.CategoryVo;
import com.ToyProject.product.service.ProductService;
import com.ToyProject.product.vo.ProductVo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Resource(name = "ProductService")
    ProductService productService;

    @Resource(name = "CategoryService")
    CategoryService categoryService;

    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
	public String selectProductList(Model model, @RequestParam("category_no") int categoryNo) throws Exception {

        List<CategoryVo> categoryList=categoryService.getCategoryList(categoryNo);
        List<ProductVo> productList=productService.selectProductList(categoryList);
        model.addAttribute("productList", productList);
        System.out.println("productListTTTTT SIZE:"+productList.size());

		return "/product/productList";
    }
    
    @ResponseBody
    @RequestMapping(value = "/product/list2", method = RequestMethod.GET)
	public List<ProductVo> selectProductList2(Model model, @RequestParam("category_no") int categoryNo) throws Exception {
        List<CategoryVo> categoryList=categoryService.getCategoryList(categoryNo);

		return productService.selectProductList(categoryList);
	}


}