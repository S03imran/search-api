package com.simran.service;

import com.simran.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
