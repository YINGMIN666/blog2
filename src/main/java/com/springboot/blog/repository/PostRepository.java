package com.springboot.blog.repository;

import com.springboot.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    // get the spring data jpa query method to retrieve a list of Post

    List<Post> findByCategoryId(Long categoryId);



}
