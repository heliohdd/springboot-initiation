package com.algaworks.springbootinitiation.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.springbootinitiation.domain.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
