package com.JollyPages.Jolly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.JollyPages.Jolly.entities.User;
import com.JollyPages.Jolly.services.OtpService;
import com.JollyPages.Jolly.services.UserService;



@Controller
public class ProfileController {

    @Autowired
    private UserService userService;

    @Autowired
    private OtpService otpService;
    private int generatedOtp;

    @GetMapping("/signup")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/sendOTP")
    public String sendOtp(@ModelAttribute User user, Model model) {
        generatedOtp = otpService.generateOTP(); // Generate OTP
        model.addAttribute("otp", generatedOtp);
        model.addAttribute("user", user);

        // Send OTP logic (e.g., via email/SMS integration, mocked here)
        System.out.println("Generated OTP: " + generatedOtp);

        return "verify";
    }

    @PostMapping("/verifyOTP")
    public String verifyOtp(@ModelAttribute User user, @RequestParam int enteredOtp, Model model) {
        if (enteredOtp == generatedOtp) {
            userService.saveUser(user); // Save user in DB if OTP is correct
            return "redirect:/home";   // Redirect to home page
        } else {
            model.addAttribute("error", "Invalid OTP. Please try again.");
            return "verify";
        }
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
