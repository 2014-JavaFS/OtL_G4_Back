package com.revature.OTL.user.Impl;

import com.revature.OTL.user.DTO.UserRequestDTO;
import com.revature.OTL.user.User;
import com.revature.OTL.user.UserRepo;
import com.revature.OTL.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public boolean login(String username, String password) {
        Optional<User> userOptional = userRepo.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();

            return passwordEncoder.matches(password, user.getPassword());
        }
        return false;

    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public User registerUser(User newUser) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User updateUser(int id, UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
