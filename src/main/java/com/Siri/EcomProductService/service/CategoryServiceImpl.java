package com.Siri.EcomProductService.service;

import com.Siri.EcomProductService.dto.CategoryResponseDTO;
import com.Siri.EcomProductService.dto.CreateCategoryRequestDTO;
import com.Siri.EcomProductService.entity.Category;
import com.Siri.EcomProductService.entity.Product;
import com.Siri.EcomProductService.exception.CategoryNotFoundException;
import com.Siri.EcomProductService.mapper.CategoryEntityDTOMapper;
import com.Siri.EcomProductService.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public CategoryResponseDTO getCategoryById(UUID categoryId) {
        Category category =  categoryRepository.findById(categoryId).orElseThrow(() -> new CategoryNotFoundException("Category not found"));
        return CategoryEntityDTOMapper.convertCategoryToCategoryResponseDTO(category);
    }

    @Override
    public List<CategoryResponseDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryResponseDTO> categoryResponseDTOs = new ArrayList<>();
        for(Category c : categories){
            categoryResponseDTOs.add(CategoryEntityDTOMapper.convertCategoryToCategoryResponseDTO(c));
        }
        return categoryResponseDTOs;
    }
    @Override
    public CategoryResponseDTO createCategory(CreateCategoryRequestDTO categoryRequestDTO) {
        Category category = CategoryEntityDTOMapper.convertCreateCategoryDTOToCategory(categoryRequestDTO);
        category = categoryRepository.save(category);
        return CategoryEntityDTOMapper.convertCategoryToCategoryResponseDTO(category);
    }

    @Override
    public CategoryResponseDTO updateCategory(CreateCategoryRequestDTO categoryRequestDTO, UUID categoryId) {
        return null;
    }

    @Override
    public boolean deleteCategory(UUID categoryId) {
      //  CategoryRepository.deleteById(categoryId);
        return false;
    }

    @Override
    public double getTotalPriceForCategory(UUID categoryId) {
            Category category = categoryRepository.findById(categoryId).orElseThrow(
                () -> new CategoryNotFoundException("Category for the given id is not found")
        );
        if (category.getProducts().isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (Product p : category.getProducts()) {
                sum = sum + p.getPrice();
            }
            return sum;
        }
    }
}
