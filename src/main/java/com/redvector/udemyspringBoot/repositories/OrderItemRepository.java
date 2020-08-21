package com.redvector.udemyspringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redvector.udemyspringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
