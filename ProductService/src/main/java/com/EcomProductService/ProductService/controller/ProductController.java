package com.EcomProductService.ProductService.controller;

import com.EcomProductService.ProductService.dto.ProductListResponseDTO;
import com.EcomProductService.ProductService.dto.ProductRequestDTO;
import com.EcomProductService.ProductService.dto.ProductResponseDTO;
import com.EcomProductService.ProductService.exception.ProductNotFoundException;
import com.EcomProductService.ProductService.model.Product;
import com.EcomProductService.ProductService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(@Qualifier("fakeStoreProductService")ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity getAllProducts() {
        ProductListResponseDTO response =  productService.getAllProducts();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity getProductById(@PathVariable("productId") int productId) throws ProductNotFoundException {
        ProductResponseDTO response =  productService.getProductById(productId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/products/title/{title}")
    public ResponseEntity getProductFromTitle(@PathVariable("title") String title){
        ProductResponseDTO response =  productService.getProductFromTitle(title);
        return ResponseEntity.ok(response);
    }
    @PostMapping("/products")
    public ResponseEntity createProduct(@RequestBody ProductRequestDTO product){
        ProductResponseDTO response = productService.createProduct(product);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity deleteProductById(@PathVariable("productId") int productId){
        productService.deleteProduct(productId);
        return ResponseEntity.ok().build();

    }
}
