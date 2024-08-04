package com.Siri.EcomProductService.service;

import com.Siri.EcomProductService.dto.fakeStoreDTOs.FakeStoreProductResponseDTO;
import com.Siri.EcomProductService.entity.Category;
import com.Siri.EcomProductService.entity.Product;
import com.Siri.EcomProductService.exception.CategoryNotFoundException;
import com.Siri.EcomProductService.repository.CategoryRepository;
import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CategoryServiceImplTest {
//    @Mock// @Mock for all dependencies
//    private CategoryRepository categoryRepository;
//    @InjectMocks // @InjectMocks for the actual class we are testing
//    private CategoryServiceImpl categoryService;
//    // this method will return the total cost for all products under a category
//
//    @BeforeEach
//    public void setup(){
//        MockitoAnnotations.initMocks(this); //not required now a days it initilised and add all the required mocks
//    }
//    @Test
//    public void testGetTotalPriceForMultipleProductsUnderCategory(){
//        //this method will return e total cost for all the products under a category
//        //Arrange
//        UUID categoryId = UUID.randomUUID();
//        Optional<Category> categoryOptionalMockData = getCategoryMockData();
//        Mockito.when(categoryRepository.findById(categoryId)).thenReturn(categoryOptionalMockData);
//        double expectedTotalCost = 300.0;
//        //Act
//        double actualTotalCost= categoryService.getTotalPriceForCategory(categoryId);
//        //Assert
//        Assertions.assertEquals(actualTotalCost,expectedTotalCost);
//    }
//    // test methods are always public void
//
//@Test
//    public void testGetTotalPriceForZeroProductsUnderCategory(){
//        //Arrange
//        UUID categoryId = UUID.randomUUID();
//        //ArrayList<FakeStoreProductResponseDTO> fakeStoreProductResponseDTOS = new ArrayList<>();
//        Optional<Category> categoryOptionalMockData = getCategoryMockDataWithZeroProducts();
//    Mockito.when(categoryRepository.findById(categoryId)).thenReturn(categoryOptionalMockData);
//    //Mockito.when(fakeStoreClient.getAllProducts()).thenReturn(fakeStoreProductResponseDTOS);
//    double expectedTotalCost = 0.0;
//    //Act
//    double actualTotalCost = categoryService.getTotalPriceForCategory(categoryId);
//    //ASSERT -> all the checks
//    Assertions.assertEquals(actualTotalCost,expectedTotalCost);
//    Mockito.verify(categoryRepository).findById(categoryId);
//    }
//
//    @Test
//    public void testGetTotalPriceForOneProductUnderCategory(){
//        UUID categoryId = UUID.randomUUID();
//        Optional<Category> categoryOptionalMockData = getCategoryMockDataWithOneProducts();
//        Mockito.when(categoryRepository.findById(categoryId)).thenReturn(categoryOptionalMockData);
//        double expectedTotalCost = 500;
//        double actualTotalCost = categoryService.getTotalPriceForCategory(categoryId);
//        Assertions.assertEquals(expectedTotalCost,actualTotalCost);
//    }
//
//    @Test
//    public void testCategoryNotFoundExceptionThrown(){
//        //arrange
//        UUID categoryId = UUID.randomUUID();
//        Mockito.when(categoryRepository.findById(categoryId)).thenReturn(Optional.empty());
//
//        //act and assert
//        Assertions.assertThrows(CategoryNotFoundException.class,
//                () -> categoryService.getTotalPriceForCategory(categoryId));
//    }
//
//    private Optional<Category> getCategoryMockDataWithZeroProducts(){
//        Category category = new Category();
//        category.setId(UUID.randomUUID());
//        category.setName("CategoryName");
//
//        List<Product> products = new ArrayList<>();
//        category.setProducts(products);
//        return Optional.of(category);
//    }
//    private Optional<Category> getCategoryMockDataWithOneProducts(){
//        Category category = new Category();
//        category.setId(UUID.randomUUID());
//        category.setName("CategoryName");
//
//        Product product3 = new Product();
//        product3.setId(UUID.randomUUID());
//        product3.setTitle("Product1");
//        product3.setPrice(500.00);
//        product3.setCategory(category);
//
//        List<Product> products = new ArrayList<>();
//        products.add(product3);
//        category.setProducts(products);
//        return Optional.of(category);
//    }
//
//    private Optional<Category> getCategoryMockData(){
//         Category category = new Category();
//         category.setName("CategoryName");
//         category.setId(UUID.randomUUID());
//
//        Product product1 = new Product();
//        product1.setId(UUID.randomUUID());
//        product1.setTitle("Product1");
//        product1.setPrice(100.00);
//        product1.setCategory(category);
//
//        Product product2 = new Product();
//        product2.setId(UUID.randomUUID());
//        product2.setTitle("Product2");
//        product2.setPrice(200.00);
//        product2.setCategory(category);
//
//        List<Product> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        category.setProducts(products);
//        return Optional.of(category);
//
//    }

}
