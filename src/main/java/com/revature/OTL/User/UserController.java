package com.revature.OTL.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
     private final UserService userService;

     @Autowired
     UserController(UserService userService){
          this.userService = userService;
     }

     @GetMapping("/{userId}")
     private ResponseEntity<User> getUserById(@PathVariable int userId) {
        return ResponseEntity.ok(userService.findById(userId));
    }

    @DeleteMapping
    private ResponseEntity<UserResponseDTO> deleteUser(@Valid @RequestBody User user) {
        userService.delete(user);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    private ResponseEntity<UserResponseDTO> putUpdateUser(@Valid @RequestBody User user) {
        userService.update(user);
        return ResponseEntity.noContent().build();
    }

     /**
      * 
      * @param user
      * @return ResponseEntity object, response status, and response body
      */
     @PostMapping
     private ResponseEntity<UserResponseDTO> registerUser(@RequestBody UserResponseDTO  userResponseDTO){
          //TODO: Add registration method
          //Validation and encryption logic should be added here
          User user = new User(userResponseDTO);
          User username = new userService.findById(userDTO.getUserId());
          User email = new userService.findByEmail(userDTO.getEmail());
          User password = new userService.findByPassword(userDTO.getPassword());
          user.setUsername(username);
          user.setEmail(email);
          user.setPassword(password);
          return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);
     }
}
