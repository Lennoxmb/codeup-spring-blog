package com.codeup.codeupspringblog.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.codeup.codeupspringblog.models.Post;
import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String allPosts(Model model) {
        ArrayList<Post> posts = new ArrayList<>();

        model.addAttribute("posts", posts);
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String postShow(Model model) {
        Post post = new Post("Test Title", "Test Body", 1L);
        model.addAttribute("post", post);

        return "/posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createForm() {
        return "view the form for creating a post";
    }

    @RequestMapping("/posts/create")
    @ResponseBody
    public String submitForm() {
        return "create a new post";
    }

}


