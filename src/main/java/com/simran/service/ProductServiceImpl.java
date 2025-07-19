package com.simran.service;

import com.simran.entity.Product;
import com.simran.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }
}
