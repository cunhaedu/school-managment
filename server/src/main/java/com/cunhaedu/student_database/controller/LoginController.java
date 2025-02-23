package com.cunhaedu.student_database.controller;

import com.cunhaedu.student_database.domain.user.LoginResponseDTO;
import com.cunhaedu.student_database.domain.user.UserAuthenticationDTO;
import com.cunhaedu.student_database.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {
    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Validated UserAuthenticationDTO data) {
        var loginResponse = this.authenticationService.authenticate(data.email(), data.password());

        return ResponseEntity.ok(loginResponse);
    }
}
