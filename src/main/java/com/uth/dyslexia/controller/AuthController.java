package com.uth.dyslexia.controller;

import com.uth.dyslexia.dto.Response;
import com.uth.dyslexia.request.LoginRequest;
import com.uth.dyslexia.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

/**
 *
 *
 * <p>Mô tả chi tiết:</p>
 *
 * @param
 * @author DanielDanzel
 * @version 1.0
 * @return
 * @throws
 * @since 2/24/2026
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginRequest request) {

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                request.getUsername(),
                                request.getPassword()
                        )
                );

        UserDetails user =
                (UserDetails) authentication.getPrincipal();

        assert user != null;
        String token = jwtService.generateToken(user);

        return ResponseEntity.ok(
                Response.builder()
                        .token(token)
                        .build()
        );
    }
}
