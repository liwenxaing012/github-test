package com.roy.mygithubtest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * creater:roy
 * time:2021年3月10日16:38:49
 * content:user
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @PostMapping("/add")
    public String add(){

        return "";
    }
}
