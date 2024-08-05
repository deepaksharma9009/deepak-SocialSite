package com.deepak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deepak.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
