package com.codeup.codeupspringblog.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository {
    //Use dependency injection to use an instance of this new Posts interface.
    Post newPost = new Post();

}
