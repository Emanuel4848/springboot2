package com.example.prueba.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("HelloService Unit Tests")
class HelloServiceTests {

    private HelloService helloService;

    @BeforeEach
    void setUp() {
        helloService = new HelloService();
    }

    @Test
    @DisplayName("Should return the correct greeting message")
    void testGetMessageReturnsCorrectMessage() {
        // Arrange
        String expectedMessage = "Hello World from Spring Boot test23";

        // Act
        String actualMessage = helloService.getMessage();

        // Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    @DisplayName("Should return a non-null message")
    void testGetMessageReturnsNonNull() {
        // Act
        String message = helloService.getMessage();

        // Assert
        assertNotNull(message);
    }

    @Test
    @DisplayName("Should return a message that contains 'Hello'")
    void testGetMessageContainsHello() {
        // Act
        String message = helloService.getMessage();

        // Assert
        assertEquals(true, message.contains("Hello"));
    }

    @Test
    @DisplayName("Should return a message that is not empty")
    void testGetMessageIsNotEmpty() {
        // Act
        String message = helloService.getMessage();

        // Assert
        assertEquals(false, message.isEmpty());
    }
}
