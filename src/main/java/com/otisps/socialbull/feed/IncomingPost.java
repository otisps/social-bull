package com.otisps.socialbull.feed;

public class IncomingPost {
    private final String message;
    private final String author;

    public IncomingPost(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}

