package com.EcomProductService.ProductService.repository;

import com.EcomProductService.ProductService.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findByOrderNumber(String orderNumber);
    Order findByOrderNumberAndOrderDate(String orderNumber, String orderDate);
    Order findByOrderNumberOrOrderDate(String orderNumber, String orderDate);
}
