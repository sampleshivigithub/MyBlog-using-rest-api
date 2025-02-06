package com.myblogrestapi.entity;

import com.springboot.blog.payload.PostDto;

import com.myblogrestapi.payload.PostDto;

public interface PostService {
    <PostDto> PostDto createPost(PostDto postDto);

    com.myblogrestapi.payload.PostDto createPost(com.myblogrestapi.payload.PostDto postDto);

    <PostDto> PostDto createPost(com.myblogrestapi.payload.PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}



