package com.tnsif.java.JUnit;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class BeforeEachDemo {

	@BeforeEach
	void beforeEach() {
        System.out.println("Before EACH test method");
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



