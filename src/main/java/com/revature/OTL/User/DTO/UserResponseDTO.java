package com.revature.OTL.User.DTO;

import com.revature.OTL.User.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
     private int userId;
     private String username;
     private String password;
     private String email;

     public UserResponseDTO(User user) {
        this.userId = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
    }
     
}
