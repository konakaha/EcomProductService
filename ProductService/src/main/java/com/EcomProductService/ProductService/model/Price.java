package com.EcomProductService.ProductService.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Price extends BaseModel{
    private double amount;
    private double discount;
    private String currency;
}
