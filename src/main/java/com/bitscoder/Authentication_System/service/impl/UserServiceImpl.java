package com.bitscoder.Authentication_System.service.impl;

import com.bitscoder.Authentication_System.dto.UserInfo;
import com.bitscoder.Authentication_System.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    private UserRepository userRepository;
    private ModelMapper modelMapper;
    private PasswordEncoder passwordEncoder;

    @Override
    public ResponseEntity<Response> signup(Request request) {
        
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return ResponseEntity.badRequest().body(Response.builder()
                    .statusCode(400)
                    .responseMessage("Attempt to save duplicate user record")
                    .build());
        }
         else {   User newUser = User.builder()
                    .email(request.getEmail())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .build();
            User savedUser = userRepository.save(newUser);

            return ResponseEntity.ok(Response.builder()
                            .statusCode(200)
                            .responseMessage("SUCCESS")
                            .userInfo(modelMapper.map(savedUser, UserInfo.class))
                    .build());
        }
    }

    @Override
    public ResponseEntity<Response> login(LoginRequest loginRequest) {
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
