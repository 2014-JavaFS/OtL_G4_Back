package com.revature.OTL.User;

import com.revature.OTL.User.DTO.UserRequestDTO;
import com.revature.OTL.User.DTO.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.revature.OTL.User.Impl.UserServiceImpl;

import jakarta.validation.Valid;

import java.util.Map;

@RestController
public class UserController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    UserController(UserServiceImpl userServiceImpl){
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping("/{userId}")
    private ResponseEntity<User> getUserById(@PathVariable int userId) {
        return ResponseEntity.ok(userServiceImpl.getUserById(userId));
    }

    @DeleteMapping
    private ResponseEntity<UserResponseDTO> deleteUser(@PathVariable int userId) {
        userServiceImpl.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    private ResponseEntity<UserResponseDTO> putUpdateUser(@Valid @RequestBody int userId, UserRequestDTO userRequestDTO) {
        userServiceImpl.updateUser(userId, userRequestDTO);
        return ResponseEntity.noContent().build();
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
