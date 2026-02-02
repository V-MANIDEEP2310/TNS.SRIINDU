package com.tnsif.java.JUnit;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

class BeforeAllDemo {

	
	 @BeforeAll
	    static void beforeAll() {
	        System.out.println("Before ALL test methods");
	    }
	 @Test
	    void testOne() {
	        System.out.println("Executing Test One");
	    }

	    @Test
	    void testTwo() {
	        System.out.println("Executing Test Two");
	    }
	

}
