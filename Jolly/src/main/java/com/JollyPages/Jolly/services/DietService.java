package com.JollyPages.Jolly.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.Diet;
import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.repositories.DietRepository;

@Service
public class DietService {

	 @Autowired
	    private DietRepository dietRepository;

	    public List<Diet> getAllDiets() {
	        return dietRepository.findAll();
	    }

	    
}
