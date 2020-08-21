package com.redvector.udemyspringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redvector.udemyspringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
