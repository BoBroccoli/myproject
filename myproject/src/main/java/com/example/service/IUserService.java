package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.User;
public interface IUserService {
	User findByEmail(int id);
	boolean save(User user);
}
