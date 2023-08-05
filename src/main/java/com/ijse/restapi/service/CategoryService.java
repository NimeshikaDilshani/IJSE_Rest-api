package com.ijse.restapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.restapi.entity.Category;
import com.ijse.restapi.entity.Item;
@Service
public interface CategoryService {
    List<Category> getAllCategory();
    Category createCategory(Category category);
    //Category getItemB(Long id);
    Category updateCategory(Long id,Category category);
}
