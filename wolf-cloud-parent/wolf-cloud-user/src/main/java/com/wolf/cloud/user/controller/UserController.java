package com.wolf.cloud.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wolf on 17/9/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${author}")
    private String author;

    @Value("${server.port}")
    String port;

    @RequestMapping("/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hi, " + name + "; port = " + port;
    }

    @GetMapping("getAuthor")
    public String author() {
        return this.author;
    }
}
