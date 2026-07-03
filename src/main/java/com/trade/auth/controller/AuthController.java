package com.trade.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trade.auth.dto.AuthResponse;
import com.trade.auth.dto.AuthValidationResponse;
import com.trade.auth.dto.LoginRequest;
import com.trade.auth.service.AuthService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return service.login(request);
    }

    @PostMapping("/validate")
    public AuthValidationResponse validate(@RequestHeader("Authorization") String token) {
        AuthValidationResponse res = service.validateToken(token.replace("Bearer ", ""));

        log.info("Auth validation response: {}", res);
        return res;
    }


}
