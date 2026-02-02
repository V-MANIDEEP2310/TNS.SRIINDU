package com.tnsif.java.JUnit;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

class AfterEachDemo {
	@Test
    void testOne() {
        System.out.println("Executing Test One");
    }

    @Test
    void testTwo() {
        System.out.println("Executing Test Two");
    }

	@AfterEach
    void afterEach() {
        System.out.println("After EACH test method");
    }

}
