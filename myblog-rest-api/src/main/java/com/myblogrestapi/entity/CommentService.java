package com.myblogrestapi.entity;

import com.myblogrestapi.exception.BlogAPIException;

import java.util.List;

public abstract class CommentService {
    public abstract CommentDto createComment(long postId, CommentDto commentDto);

    public abstract List<CommentDto> getCommentsByPostId(long postId);

    public abstract CommentDto getCommentById(Long postId, Long commentId) throws BlogAPIException;

    public abstract CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest) throws BlogAPIException;

    public abstract void deleteComment(Long postId, Long commentId) throws BlogAPIException;
}
