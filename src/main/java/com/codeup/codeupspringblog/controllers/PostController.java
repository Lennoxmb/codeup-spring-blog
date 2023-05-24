package com.codeup.codeupspringblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String viewPost() {
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "view the form for creating a post";
    }

    @RequestMapping("/posts/create")
    @ResponseBody
    public String postCreatePost() {
        return "create a new post";
    }

}

