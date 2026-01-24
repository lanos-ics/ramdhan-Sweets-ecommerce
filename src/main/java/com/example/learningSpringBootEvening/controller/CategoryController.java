package com.example.learningSpringBootEvening.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learningSpringBootEvening.service.CategoryService;

@RestController
public class CategoryController {
	
	ArrayList<String> categories = new ArrayList<>();
	
//	@Autowired
//	private CategoryService categoryService;
	
	// to Get all the categories in the DB : READ/SHOW/DISPLAY
	
	@GetMapping("/api/v1/categories")
	public ArrayList<String> getCategories()
	{
		return categories;
	}
	
	// to add a new Category to the DB :  CREATE
	
	@PostMapping("api/v1/categories/{catName}")
	public String addCategory(@PathVariable String categoryName)
	{
		categories.add(categoryName);
		return "Category " + categoryName + " added sucessfully!";
	}
	
	
	
	
	

}
