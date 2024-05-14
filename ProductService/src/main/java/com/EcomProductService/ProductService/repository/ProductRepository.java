package com.EcomProductService.ProductService.repository;

import com.EcomProductService.ProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByTitle(String title);
    Product findByTitleAAndDescription(String title, String description);
    Product findByTitleOrDescription(String title, String description);

    @Query(value = CustomQueries.FIND_PRODUCT_BY_TITLE, nativeQuery = true)
    Product findProductByTitleLike(String title);

    @Query(value = CustomQueries.FIND_ALL_PRODUCTS, nativeQuery = true)
    Product findAllProducts();

}
