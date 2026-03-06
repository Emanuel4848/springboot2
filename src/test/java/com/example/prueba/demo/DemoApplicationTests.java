package com.example.prueba.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Demo Application Tests")
class DemoApplicationTests {

	@Test
	@DisplayName("Dummy test to verify test framework is working")
	void testFrameworkWorks() {
		// Simple assertion to verify test framework
		assertTrue(true);
	}

	@Test
	@DisplayName("Verify two plus two equals four")
	void testBasicMath() {
		// Arrange
		int a = 2;
		int b = 2;
		int expected = 4;

		// Act
		int result = a + b;

		// Assert
		assertTrue(result == expected);
	}
}

