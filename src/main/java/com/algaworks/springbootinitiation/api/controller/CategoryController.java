package com.algaworks.springbootinitiation.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.springbootinitiation.domain.model.Category;


@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> categories = new ArrayList<>();
		categories.add(new Category(1L,"Electronics"));
		categories.add(new Category(2L,"Books"));
		return ResponseEntity.ok().body(categories);
	}
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<Category> findById(@PathVariable Long categoryId){
		Category category = new Category(1L, "Electronics");
		return ResponseEntity.ok(category);
	}
}
