package com.deepak.service;

import com.deepak.exception.CommentException;
import com.deepak.exception.PostException;
import com.deepak.exception.UserException;
import com.deepak.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
