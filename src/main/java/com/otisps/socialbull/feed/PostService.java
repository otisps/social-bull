package com.otisps.socialbull.feed;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    public Post postToFeed(Post postToPost) {
        return this.postRepository.save(postToPost);
    }

    public Optional<Post> getPostById(Long postId) {
        return this.postRepository.findById(postId);
    }

    public Post deletePostById(Long postId) {
        Optional<Post> postToUpdateOptional = getPostById(postId);
        if(!postToUpdateOptional.isPresent()){
            return null;
        }
        Post postToUpdate = postToUpdateOptional.get();
        this.postRepository.delete(postToUpdate);
        return postToUpdate;
    }
}
