package com.robustel.resource;

import com.robustel.application.HelloApplication;
import com.robustel.application.HelloData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloApplication helloApplication;

    public HelloController(HelloApplication helloApplication) {
        this.helloApplication = helloApplication;
    }

    @GetMapping("/hello")
    public HelloData hello(@RequestParam(required = false) String nickName) {
        return helloApplication.hello(nickName);
    }
}
