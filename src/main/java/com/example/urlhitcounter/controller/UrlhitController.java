package com.example.urlhitcounter.controller;

import com.example.urlhitcounter.model.Visitors;
import com.example.urlhitcounter.service.UrlhitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/visitor-count-app")
public class UrlhitController {
    @Autowired
    private UrlhitService urlhitService;

    @GetMapping("/count")
    public Visitors viewcount(){
        return urlhitService.visitcount();
    }
    @GetMapping("/countby/visitor/{name}")
    public String countvisitors(@PathVariable String name){
        return urlhitService.countview(name);
    }
}
