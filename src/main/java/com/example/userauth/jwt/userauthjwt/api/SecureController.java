package com.example.userauth.jwt.userauthjwt.api;

import com.example.userauth.jwt.userauthjwt.model.User;
import com.example.userauth.jwt.userauthjwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/secured")
public class SecureController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String sayHello() {
        return "Secure Hello!";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
