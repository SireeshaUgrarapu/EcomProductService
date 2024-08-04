package com.Siri.EcomProductService.controller;

import com.Siri.EcomProductService.dto.CategoryResponseDTO;
import com.Siri.EcomProductService.dto.CreateCategoryRequestDTO;
import com.Siri.EcomProductService.entity.Category;
import com.Siri.EcomProductService.service.CategoryService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static java.util.Optional.*;

public class CategoryControllerTest {
//    @Mock
//    private CategoryService categoryService;
//    @InjectMocks
//    private CategoryController  categoryController;
//
//    @BeforeEach
//    public void setup(){
//        MockitoAnnotations.initMocks(this);
//    }
//@Test
//    public void testUpdateCategorySuccess() throws Exception {
//        // arrange
//        UUID randomUUID = UUID.randomUUID();
//        CreateCategoryRequestDTO updateRequestDTO = new CreateCategoryRequestDTO();
//        updateRequestDTO.setCategoryName("NewCategoryName");
//
//        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
//        categoryResponseDTO.setCategoryId(randomUUID);
//        categoryResponseDTO.setCategoryName("NewCategoryName");
//
//        Mockito.when(categoryService.updateCategory(updateRequestDTO,randomUUID)).thenReturn(categoryResponseDTO);
//        //act
//        ResponseEntity<CategoryResponseDTO> categoryResponseEntity=categoryController.updateCategory(randomUUID,updateRequestDTO);
//        //assert
//        Assertions.assertEquals(categoryResponseDTO,categoryResponseEntity.getBody());
//
//    }
//    @Test
//    public void testCreateCategorySuccess(){
//        //Arrange
//        CreateCategoryRequestDTO createCategoryRequestDTO = new CreateCategoryRequestDTO();
//        createCategoryRequestDTO.setCategoryName("Dress");
//
//        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
//        categoryResponseDTO.setCategoryName("Dress");
//        categoryResponseDTO.setCategoryId(UUID.randomUUID());
//        Mockito.when(categoryService.createCategory(createCategoryRequestDTO)).thenReturn(categoryResponseDTO);
//        //Act
//        ResponseEntity<CategoryResponseDTO> categoryResponseEntity = categoryController.createCategory(createCategoryRequestDTO);
//        //assert
//        Assertions.assertEquals(categoryResponseDTO,categoryResponseEntity.getBody());
//    }
//    @Test
//    public void testGetCategoryByIdSuccess(){
//        //Arrange
//        UUID categoryId = UUID.randomUUID();
//        CategoryResponseDTO categoryResponseDTO = new CategoryResponseDTO();
//        categoryResponseDTO.setCategoryId(categoryId);
//        categoryResponseDTO.setCategoryName("Dress");
//        Mockito.when(categoryService.getCategoryById(categoryId)).thenReturn(categoryResponseDTO);
//        //act
//        ResponseEntity<CategoryResponseDTO> categoryResponseEntity = categoryController.getCategoryById(categoryId);
//        //assert
//        Assertions.assertEquals(categoryResponseDTO,categoryResponseEntity.getBody());
//    }
//    @Test
//    public void testGetAllCategorySuccess(){
//        List<CategoryResponseDTO> categoryResponseDTOS = GetAllCategory();
//        Mockito.when(categoryService.getAllCategories()).thenReturn(categoryResponseDTOS);
//        //act
//        ResponseEntity<List<CategoryResponseDTO>> categoryResponseEntity = categoryController.getAllCategories();
//        //Assert
//        Assertions.assertEquals(categoryResponseDTOS,categoryResponseEntity.getBody());
//
//    }
//    private List<CategoryResponseDTO> GetAllCategory(){
//        CategoryResponseDTO category1 = new CategoryResponseDTO();
//        category1.setCategoryName("Dress");
//        category1.setCategoryId(UUID.randomUUID());
//
//        CategoryResponseDTO category2 = new CategoryResponseDTO();
//        category2.setCategoryName("Kurti");
//        category2.setCategoryId(UUID.randomUUID());
//
//        CategoryResponseDTO category3 = new CategoryResponseDTO();
//        category3.setCategoryName("Dupta");
//        category3.setCategoryId(UUID.randomUUID());
//
//        List<CategoryResponseDTO> list = new ArrayList<>();
//        list.add(category1);
//        list.add(category2);
//        list.add(category3);
//        return list;
//    }
}
