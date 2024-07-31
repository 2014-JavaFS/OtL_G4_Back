package com.revature.otl.user;


import java.util.List;
import java.util.Optional;

import com.revature.otl.user.DTO.UserRequestDTO;
public interface UserService {
     boolean login(String username, String password);
     Optional<User> getUserByUsername(String username);
     User registerUser(User newUser);
     List<User> getAllUsers();
     User getUserById(int id);
     User updateUser(int id, UserRequestDTO userRequestDTO);
     void deleteUser(int id);

}
