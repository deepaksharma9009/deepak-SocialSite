package com.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
