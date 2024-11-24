package com.JollyPages.Jolly.services;

import org.springframework.stereotype.Service;

import com.JollyPages.Jolly.entities.Feedback;
import com.JollyPages.Jolly.repositories.FeedbackRepository;

@Service
public class FeedbackService {
	FeedbackRepository feedbackRepository;

	public FeedbackService(FeedbackRepository feedbackRepository) {
		this.feedbackRepository = feedbackRepository;
	}
	
	public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
	
}
