package com.revature.OTL.user.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.OTL.user.DTO.UserRequestDTO;
import com.revature.OTL.user.User;
import com.revature.OTL.user.UserRepo;
import com.revature.OTL.user.UserService;

@Service
public class UserServiceImpl implements UserService{
     private final UserRepo userRepo;
     
     @Autowired
     public UserServiceImpl(UserRepo userRepo) {
          this.userRepo = userRepo;
     }

     @Override
     public boolean login(String username, String password) {
          return false;
     }

     @Override
     public Optional<User> getUserByUsername(String username) {
          return null;
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
