package com.example.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Status;
import com.example.Entity.post;
import com.example.Service.postService;

@RestController
@RequestMapping("/post")

public class postControl {
	
	postService postSerivce;

	@PostMapping("")
	private post submitUserPost(@RequestBody post Post)
	{
		return postService.submitPostToDB(Post);
	}
	
	@GetMapping("")
	private ArrayList<post>getAllPost()
	{
		return postService.retrievePostFromDB();
	}
	
	
}
