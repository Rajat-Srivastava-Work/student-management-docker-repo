package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.User;
import com.coforge.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	 UserRepository userRepository;
	 
	 public List<User> getAllUsers() {
		 
		return userRepository.findAll();
	 }
	 
	 public User saveUser(User user) {
		 
		 return userRepository.save(user);
	 }
		
	 public User FindById(long id) {
		 
		 return userRepository.findById(id).orElseThrow(() -> new RuntimeException());
	 }
	
}
