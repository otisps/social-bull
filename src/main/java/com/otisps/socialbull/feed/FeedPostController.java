package com.otisps.socialbull.feed;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1/feed")
public class FeedPostController {


    @GetMapping("{postId}")
    public FeedPost getFeedPostById(@PathVariable("postId") Integer postId) {
        return FeedPostService.getFeedPostList().get(postId);
    }



    @GetMapping
    public Iterable<FeedPost> getAllFeedPosts(){
        return FeedPostService.getFeedPostList();
    }


    @PostMapping
    public FeedPost createNewFeedPost(@RequestBody FeedPost feedPost){
        // add to database
        return feedPost;
    }

    @DeleteMapping("{postId}")
    public FeedPost deleteFeedPost(@PathVariable Integer postId){
        // delete post from database
        return FeedPostService.getFeedPostList().get(postId);
    }

    @PutMapping("{postId}")
    public FeedPost updateFeedPostById(@PathVariable("postId") Integer postId, @RequestBody FeedPost feedPost){
        // update feed post by id
        return feedPost;
    }
}
