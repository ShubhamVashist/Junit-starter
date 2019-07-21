package com.demo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean condition =true;
		assertEquals(1, 1);
		assertEquals(true, true);
		assertEquals(true, condition);
		assertTrue(condition);
		assertFalse(condition);
		assertNotNull(null);
		assertNull(null);
		//To compare two arrays
		//assertArrayEquals(expected, actual);
	}

}
