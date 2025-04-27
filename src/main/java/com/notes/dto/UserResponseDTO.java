package com.notes.dto;

public class UserResponseDTO {

    private String userName;

    private String email;

    // Constructors
    public UserResponseDTO() {}

    public UserResponseDTO(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
