package com.algaworks.springbootinitiation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.algaworks.springbootinitiation.domain.model.Category;

@Service
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
