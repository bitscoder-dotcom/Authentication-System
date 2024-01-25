package com.bitscoder.Authentication_System.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import com.bitscoder.Authentication_System.dto.LoginRequest;
import com.bitscoder.Authentication_System.dto.Request;
import com.bitscoder.Authentication_System.dto.Response;
import com.bitscoder.Authentication_System.repository.UserRepository;
import com.bitscoder.Authentication_System.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository UserRepository;

    @Override
    public ResponseEntity<Response> signup(Request request) {
        
        if (UserRepository.findByEmail(request.getEmail()).isPresent()) {
            return Response.builder()
                .statusCode(400)
                .responseMessage(null)
        }
    }

    @Override
    public Response login(LoginRequest loginRequest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public Response sendOtp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendOtp'");
    }

    @Override
    public Response validateOtp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validateOtp'");
    }

    @Override
    public Response resetPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetPassword'");
    }

    @Override
    public Response changePassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changePassword'");
    }
    
}
