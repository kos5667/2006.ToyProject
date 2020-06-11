package com.ToyProject.product.web;

import java.util.List;

import javax.annotation.Resource;

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
    
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
	public String selectProductList(Model model, @RequestParam("category_no") int categoryNo) throws Exception {
        System.out.println("category_no SIZE:"+categoryNo);
        List<ProductVo> productList=productService.selectProductList(categoryNo);
        model.addAttribute("productList", productList);
        System.out.println("productList SIZE:"+productList.size());

		return "/product/productList";
	}


}