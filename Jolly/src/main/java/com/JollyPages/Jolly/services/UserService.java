package com.JollyPages.Jolly.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public User findByGmail(String gmail) {
        return userRepository.findByGmail(gmail);
    }
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
