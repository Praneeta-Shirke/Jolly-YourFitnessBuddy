package com.JollyPages.Jolly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByGmail(String gmail) {
        return userRepository.findByGmail(gmail);
    }
}
