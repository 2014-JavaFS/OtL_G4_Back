package com.revature.OTL.User;

import com.revature.OTL.User.DTO.*;
 import com.revature.OTL.Util.Exceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface UserService {

     boolean login(String username, String password);
     Optional<User> getUserByUsername(String username);
}