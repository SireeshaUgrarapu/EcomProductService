package com.Siri.EcomProductService.service;

import com.Siri.EcomProductService.dto.CreateProductRequestDTO;
import com.Siri.EcomProductService.dto.ProductResponseDTO;
import com.Siri.EcomProductService.dto.fakeStoreDTOs.FakeStoreProductResponseDTO;
import com.Siri.EcomProductService.entity.Product;
import com.Siri.EcomProductService.exception.ProductNotFoundException;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<ProductResponseDTO> getAllProducts();
    ProductResponseDTO getProduct(UUID productId) throws ProductNotFoundException;
    ProductResponseDTO createProduct(CreateProductRequestDTO product);
    ProductResponseDTO updateProduct(CreateProductRequestDTO updatedProduct, UUID productId);
    boolean deleteProduct(UUID productId);
    ProductResponseDTO getProduct(String productName);
    List<Product> getProducts(double minPrice, double maxPrice);
}
