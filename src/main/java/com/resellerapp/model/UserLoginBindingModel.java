package com.resellerapp.model;

import org.hibernate.validator.constraints.Length;

public class UserLoginBindingModel {

    @Length(min = 3, max = 20, message = "Username should be between 3 and 20 symbols")
    private String username;

    @Length(min = 3, max = 20,  message = "Password should be between 3 and 20 symbols")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
