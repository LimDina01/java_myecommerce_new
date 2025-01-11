package dina.com.sbproject.service;

import dina.com.sbproject.model.Category;
import java.util.List;

public interface CategoryService {
    List<Category> findAllCategories(); // Retrieves all categories

    Category saveCategory(Category category); // Saves a category

    Category getCategoryById(Long categoryId); // Fetches a category by its ID
}
