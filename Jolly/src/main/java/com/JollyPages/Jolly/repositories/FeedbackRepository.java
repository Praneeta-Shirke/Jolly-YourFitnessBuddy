package com.JollyPages.Jolly.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JollyPages.Jolly.entities.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{
	
}
