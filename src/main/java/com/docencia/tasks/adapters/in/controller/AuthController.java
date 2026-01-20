package com.docencia.tasks.adapters.in.controller;




import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.docencia.tasks.adapters.in.api.LoginRequest;
import com.docencia.tasks.adapters.in.api.TokenResponse;
import com.docencia.tasks.infrastructure.security.AuthService;
import com.docencia.tasks.infrastructure.security.JwtService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

  private final AuthService authService;
  private final JwtService jwtService;

  public AuthController(AuthService authService, JwtService jwtService) {
    this.authService = authService;
    this.jwtService = jwtService;
  }

  @PostMapping("/login")
  public TokenResponse login(@RequestBody LoginRequest req) {
    if (!authService.validateCredentials(req.getUsername(), req.getPassword())) {
      throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
    }
    return new TokenResponse(jwtService.generateToken(req.getUsername()));
  }
}