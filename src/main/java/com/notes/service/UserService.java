package com.notes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notes.entity.User;
import com.notes.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;

	public User createUser(User user) {
		return repository.save(user);
	}

	public List<User> findAllUsers() {
		return repository.findAll();
	}

}
