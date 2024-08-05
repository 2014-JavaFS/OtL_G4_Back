package com.revature.OTL.user.impl;

import com.revature.OTL.user.AppUser;
import com.revature.OTL.user.UserRepo;
import com.revature.OTL.user.UserService;
import com.revature.OTL.user.dto.UserRequestDTO;
import com.revature.OTL.util.exceptions.DataNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public boolean login(String username, String password) {
        Optional<AppUser> userOptional = userRepo.findByUsername(username);
        return userOptional.isPresent();
    }

    @Override
    public Optional<AppUser> getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public AppUser registerUser(AppUser newAppUser) {
        return userRepo.save(newAppUser);
    }

    @Override
    public List<AppUser> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public AppUser getUserById(int id) {
        AppUser appUser = userRepo.findById(id).orElseThrow(() -> new DataNotFoundException("User not found"));
        return appUser;
    }

    @Override
    public AppUser updateUser(int id, UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
