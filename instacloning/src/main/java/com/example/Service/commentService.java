package com.example.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.comment;
import com.example.Repository.commentRepo;

@Service

public class commentService {

	@Autowired
	commentRepo commentRepo;
	
	@Autowired
	UserService userService;
	
	public  comment submitCommentToDB(comment Comment)
	{
		return commentRepo.save(Comment);
	}
	public  ArrayList<comment>getAllCommentFromDB()
	{
		ArrayList<comment> commentList = commentRepo.findAllByPostId(postId);
		
		for(int i=0;i<commentList.size();i++)
		{
			comment commentItem = commentList.get(i);
			commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId()).getUserName());
		}
		
		return commentList;
	}
	
}
