package com.EcomProductService.ProductService.repository;

public interface CustomQueries {
    String FIND_PRODUCT_BY_TITLE = "SELECT * FROM product WHERE title LIKE : title AND ID = : id";
    String FIND_ALL_PRODUCTS = "SELECT * FROM Product";
}
