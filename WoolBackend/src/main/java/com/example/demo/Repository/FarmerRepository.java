package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Farmer;

@Repository
public interface FarmerRepository extends JpaRepository<Farmer,Integer> {

}
