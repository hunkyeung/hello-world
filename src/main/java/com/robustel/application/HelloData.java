package com.robustel.application;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class HelloData implements Serializable {
    private String greeting;

    public HelloData(String greeting) {
        this.greeting = greeting;
    }

    public static HelloData of(String nickName) {
        if (Objects.isNull(nickName)) {
            return new HelloData("Hello, World!");
        } else {
            return new HelloData(String.format("Hi, %s!", nickName));
        }
    }
}
