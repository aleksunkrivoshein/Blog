package com.sani_jah.blog.repo;

import com.sani_jah.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
