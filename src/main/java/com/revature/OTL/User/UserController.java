package com.revature.OTL.User;

import com.revature.OTL.User.DTO.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.OTL.User.ServiceImpl.UserServiceImpl;

import jakarta.validation.Valid;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
     private final UserServiceImpl userServiceImpl;

     UserController(UserServiceImpl userServiceImpl){
          this.userServiceImpl = userServiceImpl;
     }

     /**
      * g
      * @param newUser
      * @return ResponseEntity object, response status, and response body
      */
     @PostMapping("/register")
     private ResponseEntity<User> registerUser(@Valid @RequestBody User newUser){
          return ResponseEntity.status(HttpStatus.CREATED).body(userServiceImpl.registerUser(newUser));
     }

     @PostMapping("/login")
     public ResponseEntity<?> login(@RequestBody Map<String, String> requestBody) {
          String username = requestBody.get("username");
          String password = requestBody.get("password");


          boolean isLoggedIn = userServiceImpl.login(username, password);
          if (isLoggedIn) {
               // Successful login, return appropriate response
               return ResponseEntity.ok("Login successful");
          } else {
               // Handle failed login, e.g., return error response
               return ResponseEntity.status(401).body("Invalid credentials");
          }
     }


}
}
