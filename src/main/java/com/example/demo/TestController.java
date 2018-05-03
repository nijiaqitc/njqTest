package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public  String test() {
        System.out.print("aaa");
        System.out.print("lalala");
        System.out.print("lalala");
        return "aaa";
    }


}
