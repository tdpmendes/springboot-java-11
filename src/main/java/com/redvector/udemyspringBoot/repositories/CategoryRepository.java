package com.redvector.udemyspringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redvector.udemyspringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
