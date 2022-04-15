package com.otisps.socialbull.feed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/feed")
public class FeedPostController {

    private final FeedPostService feedPostService;

    public FeedPostController(FeedPostService feedPostService) {
        this.feedPostService = feedPostService;
    }
    // Read
    /**
     *  GET Requests for feed posts by their id.
     * @param postId id of post you want
     * @return message
     */
    @GetMapping("{postId}")
    public FeedPost getFeedPostById(@PathVariable("postId") Integer postId) {
        return FeedPostService.getFeedPostList().get(postId);
    }



    @GetMapping
    public Iterable<FeedPost> getAllFeedPosts(){
        return FeedPostService.getFeedPostList();
    }

    // TODO: Create Post

    // TODO: Update Post

    // TODO: Delete Post
}
