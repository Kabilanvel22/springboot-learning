package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface userRepository extends JpaRepository<User, Long> {
	
}
