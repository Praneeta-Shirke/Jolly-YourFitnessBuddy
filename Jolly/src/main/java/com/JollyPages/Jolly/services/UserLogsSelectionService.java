package com.JollyPages.Jolly.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.UserLogsSelection;
import com.JollyPages.Jolly.repositories.UserLogsSelectionRepository;

@Service
public class UserLogsSelectionService {
	@Autowired
    private UserLogsSelectionRepository userLogsSelectionRepository;

    public List<UserLogsSelection> getAllLogsSorted() {
        return userLogsSelectionRepository.findAllByOrderByTimestampDesc();
    }

    public void saveLog(UserLogsSelection log) {
        userLogsSelectionRepository.save(log);
    }
}
