package com.topera.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
class TestController {

    @RequestMapping("/test")
    public List<String> run() {
        List result = new ArrayList<String>();
        result.add("Apple");
        result.add("Banana");
        result.add("Lemon");
        return result;
    }

}