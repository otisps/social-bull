package com.otisps.socialbull.appuser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationUser{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String emailAddress;
    private String username;
    private String givenName;
    private String familyName;
    private String password;

    public ApplicationUser() {
    }

    public ApplicationUser(String emailAddress, String username, String givenName, String familyName, String password) {
        this.emailAddress = emailAddress;
        this.username = username;
        this.givenName = givenName;
        this.familyName = familyName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getEmailAddress() {
        return emailAddress;
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

    @Override
    public String toString() {
        return "ApplicationUser{" +
                "id=" + id +
                ", emailAddress='" + emailAddress + '\'' +
                ", username='" + username + '\'' +
                ", givenName='" + givenName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
