package com.myblogrestapi.repository;

import com.myblogrestapi.entity.Comment;

import java.util.List;

public class CommentRepository {
    public List<Comment> findByPostId(long postId) {
        return null;
    }

    public <T> ScopedValue<T> findById(Long commentId) {
        return null;
    }

    public Comment save(Comment comment) {
        return null;
    }

    public Object delete(Comment comment) {
        return null;
    }
}
