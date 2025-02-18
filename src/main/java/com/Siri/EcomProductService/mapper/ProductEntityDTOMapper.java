package com.Siri.EcomProductService.mapper;

import com.Siri.EcomProductService.dto.CreateProductRequestDTO;
import com.Siri.EcomProductService.dto.ProductResponseDTO;
import com.Siri.EcomProductService.entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductEntityToProductResponseDTO(Product product){
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setRating(product.getRating());
        responseDTO.setPrice(product.getPrice());
        responseDTO.setTitle(product.getTitle());
        responseDTO.setDescription(product.getDescription());
        responseDTO.setImageURL(product.getImageURL());
        responseDTO.setCategory(product.getCategory().getName());
        return responseDTO;
    }
    public static Product convertCreateProductRequestDTOToProduct(CreateProductRequestDTO productRequestDTO){
        Product product = new Product();
        product.setTitle(productRequestDTO.getTitle());
        product.setRating(0);
        product.setPrice(productRequestDTO.getPrice());
        product.setImageURL(productRequestDTO.getImageURL());
        product.setDescription(productRequestDTO.getDescription());
        return product;
    }
}
