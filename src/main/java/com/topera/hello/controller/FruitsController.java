package com.topera.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
class FruitsController {

    @RequestMapping("/load")
    public List<String> load() {
        List result = new ArrayList<String>();
        result.add("Apple");
        result.add("Banana");
        result.add("Lemon");
        result.add("Last Update  at " + new Date());
        return result;
    }

}