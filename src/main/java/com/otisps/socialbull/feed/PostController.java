package com.otisps.socialbull.feed;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public String getAllPosts(){
        return "here you go *hands you all the posts*";
    }

    @PostMapping
    public String postToFeed(@ModelAttribute Post post){
        return "nice post!";
    }

    @DeleteMapping("{postId}")
    public String deletePostById(@PathVariable Long postId){
        return "deleted post";
    }

    @PutMapping("{postId}")
    public String deletePostById(@PathVariable Long postId, @ModelAttribute Post post){
        return "updated post";
    }
}
