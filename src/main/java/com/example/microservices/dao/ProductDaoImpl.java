package com.example.microservices.dao;

import com.example.microservices.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Cette classe est cense etre connecte a notre BD
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, 2344, "pain"));
        products.add(new Product(2, 34, "Croissant"));
    }

    @Override
    public List<Product> productFindAll() {

        return products;
    }

    @Override
    public Optional<Product> ProductFindById(int id) {
        return products.stream()
                .filter((product -> product.getId() == id))
                .findAny();
    }

    @Override
    public Product ProductSave(Product product) {
        return product;

    }
}
