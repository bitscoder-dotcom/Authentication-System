package com.bitscoder.Authentication_System.utils;

import java.util.Random;

public class Apputils {

    public static String generateOtp() {

        StringBuilder otp = new StringBuilder();
        Random randomNumber = new Random();
        int count = 0;
        while (count < 6) {
            otp.append(randomNumber.nextInt(10));
            ++count;
        }
        return otp.toString();
    }
}

