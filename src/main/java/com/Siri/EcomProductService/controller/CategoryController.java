package com.Siri.EcomProductService.controller;

import com.Siri.EcomProductService.dto.CategoryResponseDTO;
import com.Siri.EcomProductService.dto.CreateCategoryRequestDTO;
import com.Siri.EcomProductService.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public ResponseEntity<List<CategoryResponseDTO>> getAllCategories(){
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryResponseDTO> getCategoryById(@PathVariable("id") UUID categoryId){
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
    }

    @PostMapping
    public ResponseEntity<CategoryResponseDTO> createCategory(@RequestBody CreateCategoryRequestDTO createCategoryRequestDTO){
        return ResponseEntity.ok(categoryService.createCategory(createCategoryRequestDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryResponseDTO> updateCategory(@PathVariable("id") UUID categoryId, @RequestBody CreateCategoryRequestDTO createCategoryRequestDTO) throws Exception {
        return ResponseEntity.ok(categoryService.updateCategory(createCategoryRequestDTO, categoryId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCategory(@PathVariable("id") UUID categoryId){
        return ResponseEntity.ok(categoryService.deleteCategory(categoryId));
    }

    @GetMapping("/totalPrice/{categoryId}")
    public ResponseEntity<Double> getTotalPriceForAllProducts(@PathVariable("categoryId") UUID categoryId){
        return ResponseEntity.ok(categoryService.getTotalPriceForCategory(categoryId));
    }
}
