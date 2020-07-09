package com.ToyProject.product.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.ToyProject.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @Resource(name = "ProductService")
    ProductService productService;

    //@Autowired
    //ProductService productService;

    //화면이동
    @RequestMapping(value= "/product/productList", method = RequestMethod.GET)
	public String getProductList(Model model, HttpSession session){
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		System.out.println(name);
		
		
		session.setAttribute("userId", name);

		
		return "/product/productList";
	}
}