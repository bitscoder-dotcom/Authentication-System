package com.bitscoder.Authentication_System.service;

import com.bitscoder.Authentication_System.dto.LoginRequest;
import com.bitscoder.Authentication_System.dto.Request;
import com.bitscoder.Authentication_System.dto.Response;
import org.springframework.http.ResponseEntity;

public interface UserService {
    
    ResponseEntity<Response> signup(Request request);
    ResponseEntity<Response> login(LoginRequest loginRequest);
    Response sendOtp();
    Response validateOtp();
    Response resetPassword();
    Response changePassword();
  
}
