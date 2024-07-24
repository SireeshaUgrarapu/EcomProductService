package com.Siri.EcomProductService.service;


import com.Siri.EcomProductService.dto.CreateProductRequestDTO;
import com.Siri.EcomProductService.dto.ProductResponseDTO;
import com.Siri.EcomProductService.dto.fakeStoreDTOs.FakeStoreProductResponseDTO;
import com.Siri.EcomProductService.entity.Category;
import com.Siri.EcomProductService.entity.Product;
import com.Siri.EcomProductService.exception.CategoryNotFoundException;
import com.Siri.EcomProductService.exception.ProductNotFoundException;
import com.Siri.EcomProductService.mapper.ProductEntityDTOMapper;
import com.Siri.EcomProductService.repository.CategoryRepository;
import com.Siri.EcomProductService.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service("productService")
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        //return productRepository.findAll();
        List<Product> savedProducts = productRepository.findAll();
        List<ProductResponseDTO> productResponseDTOs = new ArrayList<>();
        for(Product product : savedProducts){
            productResponseDTOs.add(ProductEntityDTOMapper.convertProductEntityToProductResponseDTO(product));
        }
        return productResponseDTOs;
    }

    @Override
    public ProductResponseDTO getProduct(UUID productId) throws ProductNotFoundException {
        /*
        // basic code to implement null check
        Product savedProduct = productRepository.findById(productId).get();
        if(savedProduct == null){
            throw new ProductNotFoundException("Product not found for id : " + productId);
        }
        return savedProduct;
         */
        Product product =  productRepository.findById(productId).orElseThrow(
                () -> new ProductNotFoundException("Product not found for id : " + productId)
        );
        return ProductEntityDTOMapper.convertProductEntityToProductResponseDTO(product);
    }
    @Override
    public ProductResponseDTO createProduct(CreateProductRequestDTO productRequestDTO) {
        Product product = ProductEntityDTOMapper.convertCreateProductRequestDTOToProduct(productRequestDTO);
        Category savedCategory = categoryRepository.findById(productRequestDTO.getCategoryId()).orElseThrow(
                () -> new CategoryNotFoundException("Category not found for id : " + productRequestDTO.getCategoryId()));
        product.setCategory(savedCategory);
        product = productRepository.save(product);
        List<Product> categoryProducts = savedCategory.getProducts();
        categoryProducts.add(product);
        savedCategory.setProducts(categoryProducts);
        categoryRepository.save(savedCategory);
        return ProductEntityDTOMapper.convertProductEntityToProductResponseDTO(product);
    }

    // cant update category and rating for a product
    @Override
    public ProductResponseDTO updateProduct(CreateProductRequestDTO createProductRequestDTO, UUID productId) {
        Product savedProduct = productRepository.findById(productId).orElseThrow(
                () -> new ProductNotFoundException("Product not found for id : " + productId));
        savedProduct.setTitle(createProductRequestDTO.getTitle());
        savedProduct.setImageURL(createProductRequestDTO.getImageURL());
        savedProduct.setPrice(createProductRequestDTO.getPrice());
        savedProduct.setDescription(createProductRequestDTO.getDescription());
        savedProduct = productRepository.save(savedProduct); // save works as upsert, which is insert and update
        return ProductEntityDTOMapper.convertProductEntityToProductResponseDTO(savedProduct);
    }
    @Override
    public boolean deleteProduct(UUID productId) {
        productRepository.deleteById(productId);
        return true;
    }

    @Override
    public ProductResponseDTO getProduct(String productName) {
        return ProductEntityDTOMapper.convertProductEntityToProductResponseDTO(
                productRepository.findProductByTitle(productName)
        );
    }


    //TODO: convert product list to product response dto list
    @Override
    public List<Product> getProducts(double minPrice, double maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }
}
