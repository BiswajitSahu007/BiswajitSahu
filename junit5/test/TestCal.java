package com.capgemini.junit.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCal {

	Caalculator c=null;
	@BeforeEach
	void createObject() {
		c=new Caalculator();
	}
		
	@Test
	void testAdd() {
		int i=c.add(-7, 5);
		assertEquals(-2, i);
	}
	@Test
	void testMul() {
		int i1=c.mul(15, 10);
		assertEquals(150, i1);
		}
	@Test
	void testFindLength() {
		int result=c.findLength("Biswajit");
		assertEquals(8, result);
	}
	
	@Test
	void testFindLengthNull() {
		assertThrows(NullPointerException.class, 
				()->{
					c.findLength(null);
				}
				);
	}
	
	@Test
	void testDivForArithemeticException() {
		assertThrows(ArithmeticException.class, 
				()->{
					c.div(100,0);
				}
				);
	}

}
