package com.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.model.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {
}
