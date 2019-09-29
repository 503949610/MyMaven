package com.hunua.mymaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloController {
    @GetMapping("/sayhello")
    public String hello() {
        return "刘华杰，湖南省株洲市";
    }
}
