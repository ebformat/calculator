package com.cours.test.junit.testing;

package com.openclassrooms.testing.calcul.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cours.test.junit.Calculator;

@ExtendWith(MockitoExtension.class)
public class TestWithMockito {
	CalculatorService classUnderTest;

	@Mock
	Calculator calculator;

	@BeforeEach
	void init() {
		classUnderTest = new CalculatorServiceImpl(calculator);
	}

	@Test
	public void add_returnsTheSum_ofTwoPositiveNumbers() {
		// Given
		when(calculator.add(1, 2)).thenReturn(3);
		final int result = classUnderTest.calculate(new CalculationModel(CalculationType.ADDITION, 1, 2))
		              .getSolution();

		assertThat(result).isEqualTo(3);
		verify(calculator).add(1, 2);
	}

	@Test
	public void add_returns_TheSum_ofTwoPositiveNumbers() {
		// Given
		when(calculator.add(any(Integer.class), any(Integer.class))).thenReturn(3);
		final int result = classUnderTest.calculate(new CalculationModel(CalculationType.ADDITION, 1, 2))
		              .getSolution();

		assertThat(result).isEqualTo(3);
		verify(calculator).add(1, 2);
	}

	@Test
	public void calculate_ShouldThrowIllegalException_forBivisionByo() {
		//GIVEN : si caculator renvoi ArithmeticException
		when(calculator.divide(1,0)).thenThrow(new ArithmeticException());
		//WHE  : Alors le service lui renvoi: IllegalArithmetic Exception
		assertThrows(IllegalArgumentException.class,()->classUnderTest.claculate)
		//THEN
		verify(calculator,times(1)).divide(1,O)
		
		
		
		
		
		
	}

}
