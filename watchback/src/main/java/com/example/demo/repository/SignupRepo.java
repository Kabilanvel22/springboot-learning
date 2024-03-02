package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Signup;



@Repository
public interface SignupRepo extends CrudRepository<Signup,Integer>{

	@Query("select cre.password from SignUp cre where cre.username=?1")
	Iterable<Signup> findAllUsernamePassword( String username);
	
	
}
