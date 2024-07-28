package com.revature.OTL.User;

import java.util.List;

import com.revature.OTL.User.DTO.UserRequestDTO;
public interface UserService {
     User registerUser(User newUser);
     List<User> getAllUsers();
     User getUserById(int id);
     User updateUser(int id, UserRequestDTO userRequestDTO);
     void deleteUser(int id);

}
