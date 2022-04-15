package com.otisps.socialbull.feed;

import com.otisps.socialbull.feed.FeedPost;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedPostService {
    private static List<FeedPost> feedPostList = List.of(new FeedPost(0, 0, "Otis Partington", "Hello World"));

    public static List<FeedPost> getFeedPostList() {
        return feedPostList;
    }

}

