package com.EcomProductService.ProductService.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductRequestDTO {
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
