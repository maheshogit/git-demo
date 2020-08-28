package com.inet.javatest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal;

	@Before
	protected void setUp() throws Exception {
		cal = new Calculator();
	}

	@Test
	public void testAdd() {
		int res = cal.add(10, 20);
		assertEquals(30, res);
		assertTrue(res > 0);
	}

	@Test
	public void testSub() {
		int res1 = cal.sub(20, 10);
		assertEquals(10, res1);
		 assertTrue(res1>0);
	}

	@After
	protected void tearDown() throws Exception {
		cal = null;
	}

}
