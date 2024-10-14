package com.mingi.service;

import java.util.List;

import com.mingi.entity.Comment;
import com.mingi.entity.Post;
import com.mingi.service.impl.CommentCallbackImpl;

public interface CommentService extends EntityService<Comment, EntityCallback<Comment>>{

	List<Comment> findAllCommentsByPost(Post post, final EntityCallback<Comment> callback);	
}