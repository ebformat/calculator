package com.cours.test.junit.testing;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.cours.test.junit.Calculator;

class CalculatorTest {
	Calculator cal;

	@Tag("concerneCalcule")
	@Test
	void testAddTwoPositiveNumber() {

		// Given
		int a = 2;
		int b = 3;
		// WHEN
		int c = cal.addTwoNumber(2, 3);
		// THEN
		assertThat(c).isEqualTo(5);

	}

	@Tag("concerneCalcule")
	@Test
	void testMultipkTwoPositiveNumber() {

		// Givessnfff
		int a = 2;
		int b = 3;

		// WHEN
		int c = cal.multiplyTwoNumber(2, 3);
		// THEN
		assertThat(c).isEqualTo(6);

	}

	@BeforeEach
	public void initialize() {
		cal = new Calculator();
	}

	@Tag("concerneTESTPARAMETERE")
	@ParameterizedTest
	@ValueSource(ints = { 4, 5, 6, 7 })
	public void testParametreMultiplyByZero(int argument) {
		int multiplyTwoNumber = cal.multiplyTwoNumber(argument, 0);
		assertThat(multiplyTwoNumber).isEqualTo(0);

	}

	@Tag("concerneTEMPEXECUTION")
	@Timeout(1)
	@Test
	public void programmeCour() {

		cal.longueCalcul();
		/*
		 * assertThatExceptionOfType(java.lang.InterruptedException.class).isThrownBy(()
		 * -> { throw new IOException("boom!"); }).withMessage("boooooooooooom!");
		 */
	}

	@Tag("concernTESTPARSINGORDRE")
	@Test
	public void verifierOrdreChiffre() {
		// Given
		Integer jj = 454777789;
		// WHEN
		Set<Integer> verifierOrdreChifffre = cal.verifierOrdreChifffre(jj);
		// THEN
		assertThat(verifierOrdreChifffre).containsExactly(4, 5, 7, 8, 9);
	}

}
