package com.revature.OTL.user;

import java.util.List;
import java.util.Optional;

import com.revature.OTL.user.dto.UserRequestDTO;

public interface UserService {

    boolean login(String username, String password);

    Optional<AppUser> getUserByUsername(String username);

    AppUser registerUser(AppUser newAppUser);

    List<AppUser> getAllUsers();

    AppUser getUserById(int id);

    AppUser updateUser(int id, UserRequestDTO userRequestDTO);

    void deleteUser(int id);

}
