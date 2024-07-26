package com.revature.OTL.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
     @Query("FROM users WHERE b.user.userId = :userId")
     Optional<User> findById(int userId);
}
