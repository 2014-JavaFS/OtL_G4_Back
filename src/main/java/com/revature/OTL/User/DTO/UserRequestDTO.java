package com.revature.OTL.User.DTO;

import com.revature.OTL.User.User;

public class UserRequestDTO {
    private int userId;
    private String username;
    private String password;

    public UserRequestDTO(User user) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }
}
