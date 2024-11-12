package com.website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.model.AuthEntity;

@Service
public interface AuthService {
	AuthEntity registerUser(AuthEntity authEntity);
	AuthEntity loginUser(String email,String password);
	public boolean updatePassword(String email, String newPassword);
	public List<AuthEntity> getAllUsers();
}