package com.JollyPages.Jolly.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class OtpService {
	public int generateOTP() {
        return new Random().nextInt(900000) + 100000;
    }
}
