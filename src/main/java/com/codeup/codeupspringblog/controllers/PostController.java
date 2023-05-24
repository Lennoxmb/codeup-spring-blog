package com.codeup.codeupspringblog.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public String createForm() {
        return "view the form for creating a post";
    }

    @RequestMapping("/posts/create")
    @ResponseBody
    public String submitForm() {
        return "create a new post";
    }

//    @RequestMapping(path = "/posts/create", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
//    public String postsCreate(HttpServletRequest request) {
//        if (request.getMethod().equals("GET")) {
//            return "view the form for creating a post";
//        } else {
//            return "create a new post";
//        }
//    }

}


