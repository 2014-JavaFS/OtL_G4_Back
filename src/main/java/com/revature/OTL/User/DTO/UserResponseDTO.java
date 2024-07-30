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
     
}
