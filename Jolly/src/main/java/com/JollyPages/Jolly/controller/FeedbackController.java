package com.JollyPages.Jolly.controller;

import org.hibernate.type.YesNoConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JollyPages.Jolly.entities.Feedback;
import com.JollyPages.Jolly.services.FeedbackService;

@Controller
public class FeedbackController {
	FeedbackService feedbackService;
	Feedback feedback;
	
	public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	@GetMapping("/feedback")
	public String getUserFeedback(Model model) {
	    model.addAttribute("feedback", new Feedback());
		return "feedback";
	}
	
	@PostMapping("/feedback")
	public String saveUserFeedback(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("phoneNo") String phoneNo,
			@RequestParam("servicesatisfaction") boolean servicesatisfaction,
			@RequestParam("suggestion") String suggestion,@ModelAttribute Feedback feedback, Model model) {

        System.out.println("Name: " + feedback.getName());
		boolean isSatisfied = true;
		if(isSatisfied) {
			feedback.isSatisfied();
		}
		if(feedback != null) {
        Feedback savedFeedback = feedbackService.saveFeedback(feedback);
        model.addAttribute("message", "Thank you for your feedback!");
		}
		return "feedback";
		
	}
	
}
