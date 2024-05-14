package com.EcomProductService.ProductService.repository;

import com.EcomProductService.ProductService.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
    Price findByAmount(double amount);
    Price findByAmountAndDiscount(double amount, double discount);
    Price findByAmountOrDiscount(double amount, double discount);
}
