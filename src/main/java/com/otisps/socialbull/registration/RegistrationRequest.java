package com.otisps.socialbull.registration;

public class RegistrationRequest {
    private final String email;
    private final String username;
    private final String givenName;
    private final String familyName;
    private final String password;
    private final Boolean isOldEnough;

    public RegistrationRequest(String email, String username, String givenName, String familyName, String password, Boolean isOldEnough) {
        this.email = email;
        this.username = username;
        this.givenName = givenName;
        this.familyName = familyName;
        this.password = password;
        this.isOldEnough = isOldEnough;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPassword() {
        return password;
    }
}
