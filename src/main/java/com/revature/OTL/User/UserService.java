package com.revature.OTL.User;

import com.revature.OTL.User.DTO.*;
 import com.revature.OTL.Util.Exceptions.*;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
     private final UserRepo userRepo;
     
     public UserService(UserRepo userRepo) {
          this.userRepo = userRepo;
     }

     public UserResponseDTO registerUser(User newUser){
          Optional<User> user = Optional.of(userRepo.save(newUser));
          user.orElseThrow(() -> new InvalidInputException("Double Check "));
          return user.map(UserResponseDTO::new).get();
     }
}
