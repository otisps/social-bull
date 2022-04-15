package com.otisps.socialbull.feed;

import com.otisps.socialbull.feed.FeedPost;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedPostService {
    private final static List<FeedPost> feedPostList = List.of(
            new FeedPost( "Otis Partington", "Hello Spring!"),
            new FeedPost("Mori Partington", "Woof!"),
            new FeedPost("Sherlock Partington", "WOOF"));

    public static List<FeedPost> getFeedPostList() {
        return feedPostList;
    }

}

