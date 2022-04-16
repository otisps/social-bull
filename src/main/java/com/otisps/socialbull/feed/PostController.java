package com.otisps.socialbull.feed;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/feed")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public Iterable<Post> getAllPosts(){
        return this.postService.getAllPosts();
    }

    @PostMapping
    public Post postToFeed(@ModelAttribute IncomingPost post){
        if(post.getMessage() == null){
            return null;
        }
        if(post.getAuthor() == null) {
            return null;
        }

        Post postToPost = new Post(post.getMessage(), post.getAuthor());
        return this.postService.postToFeed(postToPost);
    }

    @PutMapping("{postId}")
    public Post updatePostById(@PathVariable("postId") Long postId, @ModelAttribute IncomingPost update) throws ChangeSetPersister.NotFoundException {

        Post updateThisPost = this.postService.deletePostById(postId);
        Post postToSave;
        if(updateThisPost == null){
            return null;
        }

        if(update.getMessage() != null){
            postToSave = new Post(update.getMessage(), updateThisPost.getAuthor());
            this.postService.postToFeed(postToSave);
            return postToSave;
        }
        // TODO: throw exceptions instead of return null (everywhere in this class)
        return null;
    }

    @DeleteMapping("{postId}")
    public Post deletePostById(@PathVariable Long postId){
        return this.postService.deletePostById(postId);
    }
}
