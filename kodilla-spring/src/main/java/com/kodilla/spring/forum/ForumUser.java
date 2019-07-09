package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

     public String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }
}
