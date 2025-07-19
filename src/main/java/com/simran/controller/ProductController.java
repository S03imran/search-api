package com.simran.controller;

import com.simran.entity.Product;
import com.simran.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam("query") String query){
        List<Product> list = productService.searchProducts(query);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product savedProduct = productService.createProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }
}
