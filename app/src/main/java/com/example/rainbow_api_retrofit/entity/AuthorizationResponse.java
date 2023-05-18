package com.example.rainbow_api_retrofit.entity;

public class AuthorizationResponse {
    private LoggedInUser loggedInUser;
    private String token;

    public LoggedInUser getLoggedInUser() {
        return loggedInUser;
    }

    public String getToken() {
        return token;
    }
}
