package com.JollyPages.Jolly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.Diet;
import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.repositories.WorkoutRepository;

import java.util.List;

@Service
public class WorkoutService {

	@Autowired
    private WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

}
