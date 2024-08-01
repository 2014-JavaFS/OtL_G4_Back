package com.revature.OTL.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.OTL.user.impl.UserServiceImpl;

import jakarta.validation.Valid;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
     private final UserService userService;

     @Autowired
     public UserController(UserService userService) {
          this.userService = userService;
     }

     /**
      * g
      * @param newAppUser
      * @return ResponseEntity object, response status, and response body
      */
     @PostMapping("/register")
     private ResponseEntity<AppUser> registerUser(@Valid @RequestBody AppUser newAppUser){
          return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerUser(newAppUser));
     }

     @PostMapping("/login")
     public ResponseEntity<?> login(@RequestBody Map<String, String> requestBody) {
          String username = requestBody.get("username");
          String password = requestBody.get("password");

          boolean isLoggedIn = userService.login(username, password);
          if (isLoggedIn) {
               // Successful login, return appropriate response
               return ResponseEntity.ok("Login successful");
          } else {
               // Handle failed login, e.g., return error response
               return ResponseEntity.status(401).body("Invalid credentials");
          }
     }

}

