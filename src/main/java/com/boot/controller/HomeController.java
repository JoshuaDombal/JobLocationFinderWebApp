package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/**
 * Created by JoshDombal on 12/24/18.
 */
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World?..";
    }
}
