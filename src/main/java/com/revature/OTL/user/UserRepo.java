package com.revature.OTL.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

     Optional<User> findByUsername(String username);


     @Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
     Optional<User> authCheck(@Param("username") String username, @Param("password") String password);
}
