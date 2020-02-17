package com.example.microservices.web.controllers;

import com.example.microservices.dao.ProductDao;
import com.example.microservices.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping(value = "/Products")
    public List<Product> getProducts() {

        return productDao.productFindAll();
    }

    @GetMapping(value = "/Products/{id}")
    public Product getProduct(@PathVariable int id){
        Product product = new Product(id,1234,"tomato");
        return product;
    }
}
