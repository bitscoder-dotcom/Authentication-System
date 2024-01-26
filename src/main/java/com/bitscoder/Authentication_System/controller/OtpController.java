package com.bitscoder.Authentication_System.controller;

import com.bitscoder.Authentication_System.dto.OtpRequest;
import com.bitscoder.Authentication_System.dto.OtpResponse;
import com.bitscoder.Authentication_System.dto.OtpValidationRequest;
import com.bitscoder.Authentication_System.dto.Response;
import com.bitscoder.Authentication_System.service.impl.OtpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/otp/")
public class OtpController {

    private final OtpService otpService;

    @PostMapping("sendOtp")
    public Response sendOtp(@RequestBody OtpRequest otpRequest) {
        return otpService.sendOtp(otpRequest);
    }

    @PostMapping("validateOtp")
    public Response validateOtp(@RequestBody OtpValidationRequest otpValidationRequest) {
        return otpService.validateOtp(otpValidationRequest);
    }
}
