package com.deepak.service;

import java.util.List;

import com.deepak.exception.UserException;
import com.deepak.model.Reels;
import com.deepak.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
