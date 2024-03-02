package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.student.demo;

@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		//SpringApplication.run(Springdemo1Application.class, args);
		
		ConfigurableApplicationContext apt = SpringApplication.run(Springdemo1Application.class, args);
		demo d1 = (demo) apt.getBean("demo");
		System.out.println(d1.hello());
	}

}
