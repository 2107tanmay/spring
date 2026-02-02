package com.springmvc.mvc_demo.controllers;

import com.springmvc.mvc_demo.model.Product;
import com.springmvc.mvc_demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
}

