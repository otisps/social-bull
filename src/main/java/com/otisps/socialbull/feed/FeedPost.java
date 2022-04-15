package com.otisps.socialbull.feed;

//@Entity
public class FeedPost {

    private final Integer id;
    private final Integer authorId;
    private final String authorGivenName;
    private final String message;


    public FeedPost(Integer id, Integer authorId, String authorGivenName, String message) {
        this.id = id;
        this.authorId = authorId;
        this.authorGivenName = authorGivenName;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public String getAuthorGivenName() {
        return authorGivenName;
    }

    public String getMessage() {
        return message;
    }
}
