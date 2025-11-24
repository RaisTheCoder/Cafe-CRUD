package me.raiko.cafecrud.Service;

import me.raiko.cafecrud.Model.Category;
import me.raiko.cafecrud.Repository.CategoryRepository;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Service Methods
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findByName(String name) {
        return categoryRepository.findByName(name);
    }

    public Optional<Category> findById(@NonNull Long id) {
        return categoryRepository.findById(id);
    }

    public Category save(@NonNull Category category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(@NonNull Category category) {
        categoryRepository.delete(category);
    }
}
