package com.redvector.udemyspringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redvector.udemyspringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
