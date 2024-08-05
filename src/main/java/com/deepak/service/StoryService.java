package com.deepak.service;

import java.util.List;

import com.deepak.exception.StoryException;
import com.deepak.exception.UserException;
import com.deepak.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
