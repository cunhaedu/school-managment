package com.cunhaedu.student_database.crosscutting.security;

import com.cunhaedu.student_database.crosscutting.model.UserAuthenticated;
import com.cunhaedu.student_database.crosscutting.service.TokenService;
import com.cunhaedu.student_database.domain.user.User;
import com.cunhaedu.student_database.repository.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;

@Component
public class SecurityFilter extends OncePerRequestFilter {
    private final TokenService tokenService;
    private final UserRepository userRepository;

    SecurityFilter(TokenService tokenService, UserRepository userRepository) {
        this.tokenService = tokenService;
        this.userRepository = userRepository;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        var token = this.recover(request);

        if(token != null) {
            var subject = this.tokenService.validateToken(token);
            Optional<User> user = this.userRepository.findByEmail(subject);

            var userAuthenticated = user
                    .map(UserAuthenticated::new)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));

            var authentication = new UsernamePasswordAuthenticationToken(userAuthenticated, null, userAuthenticated.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        filterChain.doFilter(request, response);

    }

    private String recover(HttpServletRequest request) {
        var authHeader = request.getHeader("Authorization");

        if(authHeader == null) {
            return null;
        }

        return authHeader.replace("Bearer ", "");
    }
}
