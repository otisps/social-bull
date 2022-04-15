package com.otisps.socialbull.feed;

//@Entity
public class FeedPost {
    private final String authorGivenName;
    private final String message;


    public FeedPost(String authorGivenName, String message) {
        this.authorGivenName = authorGivenName;
        this.message = message;
    }


    public String getAuthorGivenName() {
        return authorGivenName;
    }

    public String getMessage() {
        return message;
    }
}
