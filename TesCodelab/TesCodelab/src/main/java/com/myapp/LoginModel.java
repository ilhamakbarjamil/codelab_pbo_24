package com.myapp;

public class LoginModel {
    private final String USERNAME = "Akbar";
    private final String PASSWORD = "ngabrezz";

    public boolean authenticate(String username, String password) {
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}
