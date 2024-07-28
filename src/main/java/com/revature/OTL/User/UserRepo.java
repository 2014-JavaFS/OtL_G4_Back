package com.revature.OTL.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
     Optional<User> findByUsernameAndPassword(String username, String password);

     @Query("FROM users WHERE username = :username AND password = :password")
     Optional<User> authCheck(String username, String password);
}
