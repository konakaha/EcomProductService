package com.EcomProductService.ProductService.mapper;

import com.EcomProductService.ProductService.dto.*;
import com.EcomProductService.ProductService.model.Product;

import java.util.List;
import java.util.UUID;

public class ProductMapper {
    public static FakeStoreProductRequestDTO productRequestToFakeStoreProductRequest(ProductRequestDTO productRequestDTO){
        FakeStoreProductRequestDTO fakeStoreProductRequestDTO = new FakeStoreProductRequestDTO();
        fakeStoreProductRequestDTO.setCategory(productRequestDTO.getCategory());
        fakeStoreProductRequestDTO.setDescription(productRequestDTO.getDescription());
        fakeStoreProductRequestDTO.setPrice(productRequestDTO.getPrice());
        fakeStoreProductRequestDTO.setImage(productRequestDTO.getImage());
        fakeStoreProductRequestDTO.setTitle(productRequestDTO.getTitle());
        return fakeStoreProductRequestDTO;
    }

    public static ProductResponseDTO fakeProductResponseToProductResponse(FakeStoreProductResponseDTO fakeStoreProductResponseDTO){
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setId(fakeStoreProductResponseDTO.getId());
        productResponseDTO.setPrice(fakeStoreProductResponseDTO.getPrice());
        productResponseDTO.setTitle(fakeStoreProductResponseDTO.getTitle());
        productResponseDTO.setDescription(fakeStoreProductResponseDTO.getDescription());
        productResponseDTO.setCategory(fakeStoreProductResponseDTO.getCategory());
        productResponseDTO.setImage(fakeStoreProductResponseDTO.getImage());
        return productResponseDTO;
    }

    public static ProductListResponseDTO convertProductsToProductListResponseDTO(List<Product> products){
        ProductListResponseDTO productListResponseDTO = new ProductListResponseDTO();
        for(Product p : products){
            ProductResponseDTO productResponseDTO = new ProductResponseDTO();
            productResponseDTO.setId(p.getId());
            productResponseDTO.setImage(p.getImage());
            productResponseDTO.setTitle(p.getTitle());
            productResponseDTO.setPrice(p.getPrice().getAmount());
            productResponseDTO.setDescription(p.getDescription());
            productResponseDTO.setCategory(p.getCategory().getCategoryName());
            productListResponseDTO.getProducts().add(productResponseDTO);
        }
        return productListResponseDTO;
    }

    public static ProductResponseDTO convertProductToProductResponseDTO(Product p){
        ProductResponseDTO productResponseDTO = new ProductResponseDTO();
        productResponseDTO.setId(p.getId());
        productResponseDTO.setImage(p.getImage());
        productResponseDTO.setTitle(p.getTitle());
        productResponseDTO.setPrice(p.getPrice().getAmount());
        productResponseDTO.setDescription(p.getDescription());
        productResponseDTO.setCategory(p.getCategory().getCategoryName());
        return productResponseDTO;
    }

    public static int convertUUIDtoInt(UUID id){
        return Integer.parseInt(id.toString());
    }

    public static UUID convertIntToUUID(int id){
        return UUID.fromString(String.valueOf(id));
    }
}


