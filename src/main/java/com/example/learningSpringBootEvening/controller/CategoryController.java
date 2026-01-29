package com.example.learningSpringBootEvening.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningSpringBootEvening.model.Category;
import com.example.learningSpringBootEvening.service.CategoryService;

@RestController
public class CategoryController {
	
	ArrayList<Category> categories = new ArrayList<>(); // DB
	
	
	// to Get all the categories in the DB : READ/SHOW/DISPLAY
	
	@GetMapping("api/v1/categories/{catId}")
	public List<Category> getCategory(@PathVariable Long catId)
	{
		List<Category> category = categories.stream().filter(cat -> cat.getId() == catId).toList() ;
		
		
		return category;
	}
	
	@GetMapping("/api/v1/categories")
	public ArrayList<Category> getCategories()
	{
		return categories;
	}
	
	// to add a new Category to the DB :  CREATE
	
	@PostMapping("api/v1/categories")
	public String addCategory(@RequestBody Category newCategory)
	{
		categories.add(newCategory);
		return "Category "+ newCategory.getCategoryName() + " added sucessfully!";
	}
	
	
	
	
	

}
