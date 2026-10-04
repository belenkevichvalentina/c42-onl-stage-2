package com.example.c42onl.homework_28.storage;

import com.example.c42onl.homework_28.model.Post;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPostStorage {
    private static final List<Post> POSTS = new ArrayList<>();
    public  void save(Post post){
        POSTS.add(post);
    }
    public List<Post> findAll(){
        return new ArrayList<>(POSTS);
    }
}
