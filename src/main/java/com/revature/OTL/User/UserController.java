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
     private final UserService userService;

     UserController(UserService userService){
          this.userService = userService;
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
     @PostMapping
     private ResponseEntity<UserResponseDTO> registerUser(@RequestBody UserResponseDTO  userResponseDTO){
          //TODO: Add registration method
          //Validation and encryption logic should be added here
          User usr = new User(userResponseDTO);
          User username = new userService.findById(userDTO.getUserId());
          User email = new userService.findByEmail(userDTO.getEmail());
          User password = new userService.findByPassword(userDTO.getPassword());
          usr.setUsername(username);
          usr.setEmail(email);
          usr.setPassword(password);
          return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);
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
}
