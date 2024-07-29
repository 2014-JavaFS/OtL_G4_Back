package com.revature.OTL.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.OTL.User.ServiceImpl.UserServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
     private final UserServiceImpl userServiceImpl;

     @Autowired
     public UserController(UserServiceImpl userServiceImpl){
          this.userServiceImpl = userServiceImpl;
     }

     /**
      * 
      * @param user
      * @return ResponseEntity object, response status, and response body
      */
     @PostMapping("/register")
     private ResponseEntity<User> registerUser(@Valid @RequestBody User newUser){
          return ResponseEntity.status(HttpStatus.CREATED).body(userServiceImpl.registerUser(newUser));
     }
}
