package com.revature.OTL.User.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.OTL.User.DTO.UserRequestDTO;
import com.revature.OTL.User.User;
import com.revature.OTL.User.UserRepo;
import com.revature.OTL.User.UserService;

@Service
public class UserServiceImpl implements UserService{
     private final UserRepo userRepo;
     
     @Autowired
     public UserServiceImpl(UserRepo userRepo) {
          this.userRepo = userRepo;
     }

     @Override
     public User registerUser(User newUser){
          return userRepo.save(newUser);
     }
     @Override
     public List<User> getAllUsers(){
          return null;
     }
     @Override
     public User getUserById(int id){
          return null;
     }

     @Override
     public User updateUser(int id, UserRequestDTO userRequestDTO){
          return null;
     }

     @Override
     public void deleteUser(int id){
     }

     public User findByUsernameAndPassword(String username, String password){
          return null;
     }
}
