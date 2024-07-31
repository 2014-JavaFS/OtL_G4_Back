package com.revature.OTL.user;


import java.util.List;
import java.util.Optional;

import com.revature.OTL.user.DTO.UserRequestDTO;
public interface UserService {
     boolean login(String username, String password);
     Optional<User> getUserByUsername(String username);
     User registerUser(User newUser);
     List<User> getAllUsers();
     User getUserById(int id);
     User updateUser(int id, UserRequestDTO userRequestDTO);
     void deleteUser(int id);

}
