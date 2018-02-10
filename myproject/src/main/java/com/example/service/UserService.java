package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.IUserDao;
import com.example.model.User;
@Service
public class UserService implements IUserService{
	@Autowired
	private IUserDao userdao;
	@Override
	public User findByEmail(int id) {
		User user = userdao.findById(id).get();
		return user;
	}
	public boolean save(User user) {
		userdao.save(user);
		return true;
	}

}
