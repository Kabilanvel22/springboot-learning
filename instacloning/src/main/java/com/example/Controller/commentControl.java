package com.example.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.comment;
import com.example.Service.commentService;

@RestController
@RequestMapping("/comment")

public class commentControl {

	@Autowired
	commentService commmentService;
	
	@PostMapping("")
			private comment submitComment(@RequestBody comment comments)
			{
		        return  commentService.submitCommentToDB(comments);
			}
	@GetMapping("")
	private ArrayList<comment> getCommentForPost(@PathVariable("postId") String postId)
	{
		return commentService.getAllCommentFromDB(postId);
	}
}
