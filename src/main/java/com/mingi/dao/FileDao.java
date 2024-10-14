package com.mingi.dao;

import java.util.List;

import com.mingi.entity.FileEntity;
import com.mingi.entity.Post;

public interface FileDao {
    void save(FileEntity file);
    FileEntity findById(Long id);
    List<FileEntity> findAllByPost(Post post);
}