package com.robustel.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloDataTest {
    @Test
    void Given_Empty_When_Hello_Then_DefaultGreeting() {
        assertEquals("Hello, World!", HelloData.of(null).getGreeting());
    }

    @Test
    void Given_ANickname_When_Hello_Then_Expected() {
        assertEquals("Hello, robustel!", HelloData.of("robustel").getGreeting());
    }
}