package com.myspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuyue on 2020/11/2.
 */
@Slf4j
@RestController
@RequestMapping
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "sssss";
    }
}
