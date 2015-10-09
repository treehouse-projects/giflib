package com.teamtreehouse.giflib.data;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES =Arrays.asList(
        new Category(1,"Technology"),
        new Category(2,"People"),
        new Category(3,"Destruction")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for(Category category : ALL_CATEGORIES) {
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
        // OR return ALL_CATEGORIES.stream().filter(category -> category.getId() == id).findFirst().get();
    }
}
