package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.data.CategoryRepository;
import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Category;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(Model model) {
        List<Category> categories = categoryRepository.getAllCategories();
        model.addAttribute("categories",categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String category(@PathVariable int id, Model model) {
        List<Gif> gifs = gifRepository.findByCategoryId(id);
        Category category = categoryRepository.findById(id);
        model.addAttribute("category", category);
        model.addAttribute("gifs",gifs);
        return "category";
    }
}
