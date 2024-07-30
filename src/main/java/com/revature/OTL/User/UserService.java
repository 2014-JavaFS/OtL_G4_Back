package com.revature.OTL.User;

import com.revature.OTL.User.DTO.*;
 import com.revature.OTL.Util.Exceptions.*;
import org.springframework.stereotype.Service;
import java.util.List;

import com.revature.OTL.User.DTO.UserRequestDTO;
public interface UserService {
     boolean login(String username, String password);
     Optional<User> getUserByUsername(String username);
     User registerUser(User newUser);
     List<User> getAllUsers();
     User getUserById(int id);
     User updateUser(int id, UserRequestDTO userRequestDTO);
     void deleteUser(int id);

}
