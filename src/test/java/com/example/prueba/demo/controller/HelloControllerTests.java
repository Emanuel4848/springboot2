package com.example.prueba.demo.controller;

import com.example.prueba.demo.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("HelloController Unit Tests")
class HelloControllerTests {

    private HelloController helloController;
    private HelloService helloService;

    @BeforeEach
    void setUp() {
        helloService = new HelloService();
        helloController = new HelloController(helloService);
    }

    @Test
    @DisplayName("Should return string from sayHello method")
    void testSayHelloReturnsString() {
        // Act
        String result = helloController.sayHello();

        // Assert
        assertNotNull(result);
    }

    @Test
    @DisplayName("Should return correct message from sayHello")
    void testSayHelloReturnsCorrectMessage() {
        // Act
        String result = helloController.sayHello();

        // Assert
        assertEquals("Hello World from Spring Boot test11", result);
    }

    @Test
    @DisplayName("Should return non-empty string")
    void testSayHelloReturnsNonEmptyString() {
        // Act
        String result = helloController.sayHello();

        // Assert
        assertEquals(false, result.isEmpty());
    }

    @Test
    @DisplayName("Should call getMessage from service")
    void testSayHelloCallsService() {
        // Arrange
        String serviceMessage = helloService.getMessage();

        // Act
        String controllerResult = helloController.sayHello();

        // Assert
        assertEquals(serviceMessage, controllerResult);
    }

    @Test
    @DisplayName("Should return message containing 'Hello'")
    void testSayHelloMessageContainsHello() {
        // Act
        String result = helloController.sayHello();

        // Assert
        assertEquals(true, result.contains("Hello"));
    }
}



