package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.dealer;


@Repository
public interface dealerRepository extends JpaRepository<dealer,Integer>  {

}
