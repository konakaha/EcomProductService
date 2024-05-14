package com.EcomProductService.ProductService.service;

import com.EcomProductService.ProductService.dto.ProductListResponseDTO;
import com.EcomProductService.ProductService.dto.ProductRequestDTO;
import com.EcomProductService.ProductService.dto.ProductResponseDTO;
import com.EcomProductService.ProductService.exception.ProductNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
    ProductListResponseDTO getAllProducts();
    ProductResponseDTO getProductById(int productId) throws ProductNotFoundException;
    ProductResponseDTO getProductFromTitle(String title);
    ProductResponseDTO createProduct(ProductRequestDTO product);
    ProductResponseDTO updateProduct(int productId, ProductRequestDTO product);
    void deleteProduct(int productId);
}
