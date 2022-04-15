package com.otisps.socialbull.feed;

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

    @Override
    public String toString() {
        return "FeedPost{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", authorGivenName='" + authorGivenName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
