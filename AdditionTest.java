package com.junitdemo1;

import org.junit.Test;
import org.junit.Assert;

public class AdditionTest {

	@Test
	public void additionOfTwoNumbersTest() {
		Arithmetic obj = new Arithmetic();
		int result = obj.sum(5, 5);
		Assert.assertEquals(10, result);
	}
}
