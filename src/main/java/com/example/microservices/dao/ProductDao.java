package com.example.microservices.dao;

import com.example.microservices.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductDao {
    public List<Product> productFindAll();

    public Optional<Product> ProductFindById(int id);

    public Product ProductSave(Product product);
}
