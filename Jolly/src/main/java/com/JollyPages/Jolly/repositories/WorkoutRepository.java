package com.JollyPages.Jolly.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Integer>{
	// Search workouts by workout name
    List<Workout> findByworkoutnameLike(String workoutname);

}
