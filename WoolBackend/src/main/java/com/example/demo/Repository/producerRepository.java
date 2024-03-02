package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.producer;


@Repository
public interface producerRepository extends JpaRepository<producer,Integer>  {

}
