package com.springmvc.mvc_demo.services;

import com.springmvc.mvc_demo.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;


@Component
public class ProductService {

    ArrayList<Product> productList = new ArrayList<>(Arrays.asList(new Product(101,"Iphone","Electronics", 1000.0),
            new Product(102,"S25","Electronics", 1200.0)));

    public ArrayList<Product> getProducts(){
        return this.productList;
    }
}
