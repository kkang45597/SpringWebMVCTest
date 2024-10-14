package com.mingi.dao;

import java.util.List;

import com.mingi.dao.Dao;
import com.mingi.entity.Comment;
import com.mingi.entity.Post;

public interface CommentDao extends Dao<Comment>{

    List<Comment> findAllCommentsByPost(Post post);

}
