package com.EcomProductService.ProductService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "ECOM_ORDER")
public class Order extends BaseModel{
    private String orderNumber;
    @ManyToMany //One product can be in many orders and vice versa
    private List<Product> products;
    private double totalAmount;
}
