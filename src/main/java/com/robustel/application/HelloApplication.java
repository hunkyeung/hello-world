package com.robustel.application;

import org.springframework.stereotype.Service;

@Service
public class HelloApplication {

    public HelloData hello(String nickName) {
        return HelloData.of(nickName);
    }
}
