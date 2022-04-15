package com.otisps.socialbull.feed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/feed")
public class FeedPostController {

    @GetMapping("{postId}")
    public String getFeedPostById(@PathVariable("postId") Integer postId){
        // TODO: Get
        return new FeedPost(1, 1, "Otis Partington", "Hello World'").toString();
    }
}
