package com.redvector.udemyspringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redvector.udemyspringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
