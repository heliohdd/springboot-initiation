package com.algaworks.springbootinitiation.domain.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.algaworks.springbootinitiation.domain.model.Category;

@Component
public class CategoryRepository {
	
	private Map<Long, Category> categories = new HashMap<>();
//	categories. (new Category(1L, ""));

	public void save(Category category) {
		categories.put(category.getId(), category);
	}
	
	public Category findById(Long categoryId) {
		return categories.get(categoryId);
	}
	
	public List<Category> findAll(){
		return new ArrayList<Category>(categories.values());
	}
}