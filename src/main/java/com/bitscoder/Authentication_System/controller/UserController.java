package com.bitscoder.Authentication_System.controller;

import com.bitscoder.Authentication_System.dto.Request;
import com.bitscoder.Authentication_System.dto.Response;
import com.bitscoder.Authentication_System.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("api/v1/auth/")
public class UserController {

    private UserService userService;

    @PostMapping("signup")
    public ResponseEntity<Response> signup (@RequestBody Request request) {
        return userService.signup(request);
    }
}
