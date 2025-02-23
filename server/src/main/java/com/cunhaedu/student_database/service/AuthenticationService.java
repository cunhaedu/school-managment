package com.cunhaedu.student_database.service;

import com.cunhaedu.student_database.crosscutting.model.UserAuthenticated;
import com.cunhaedu.student_database.crosscutting.service.TokenService;
import com.cunhaedu.student_database.domain.user.LoginResponseDTO;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    AuthenticationService(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    public LoginResponseDTO authenticate(String email, String password) {
        var emailAndPassword = new UsernamePasswordAuthenticationToken(email, password);
        Authentication authentication = authenticationManager.authenticate(emailAndPassword);
        var user = (UserAuthenticated) authentication.getPrincipal();
        var token = this.tokenService.generateToken(user.getUser());

        return new LoginResponseDTO(token);
    }
}
