package com.cours.test.junit.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.cours.test.junit.Calculator;

class CalculatorTest {

	@Test
	void testAddTwoPositiveNumber() {

		// Given
		int a = 2;
		int b = 3;
		Calculator cal = new Calculator();
		// WHEN
		int c = cal.addTwoNumber(2, 3);
		// THEN
		assertThat(c).isEqualTo(5);

	}

	@Test
	void testMultipkTwoPositiveNumber() {

		// Given
		int a = 2;
		int b = 3;
		Calculator cal = new Calculator();
		// WHEN
		int c = cal.multiplyTwoNumber(2, 3);
		// THEN
		assertThat(c).isEqualTo(6);

	}

}
