package com.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
