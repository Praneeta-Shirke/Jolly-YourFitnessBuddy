package com.JollyPages.Jolly.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.Workout;
import com.JollyPages.Jolly.repositories.WorkoutRepository;

import java.util.List;

@Service("workoutbean")
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }
}
