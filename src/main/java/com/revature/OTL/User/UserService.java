package com.revature.OTL.User;

import com.revature.OTL.User.DTO.*;
import com.revature.OTL.Util.Exceptions.*;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
     private final UserRepo userRepo;
     
     @Autowired
     public UserService(UserRepo userRepo) {
          this.userRepo = userRepo;
     }

     @Override
     public List<User> findAll() {
        return null;
     }

     @Override
     public User findById(int userId) {
        return userRepo.findById(userId).orElseThrow(() -> new DataNotFoundException("Nothing in the database with ID of " + userId));
     }

     @Override
     public boolean delete(User removedUser) {
        userRepo.delete(removedUser);
        return true;
     }

     public UserResponseDTO registerUser(User newUser){
          Optional<User> user = Optional.of(userRepo.save(newUser));
          user.orElseThrow(() -> new InvalidInputException("Double Check "));
          return user.map(UserResponseDTO::new).get();
     }

     public boolean update(User updatedUser) {
        userRepo.save(updatedUser);
        return true;
    }
}
