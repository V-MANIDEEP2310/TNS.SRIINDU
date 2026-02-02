package com.tnsif.java.JUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedDemo {
	@ParameterizedTest
	@ValueSource(strings= {"CAN","VAN","TAN"})
	void endsWithN(String str) {
		assertTrue(str.endsWith("N"));
	}

	private void assertTrue(boolean endsWith) {
		// TODO Auto-generated method stub
		
	}

	

}
