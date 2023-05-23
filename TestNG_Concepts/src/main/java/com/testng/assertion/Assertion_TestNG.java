package com.testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_TestNG {
	String name = "Jack";
	Boolean value_1 = true;
	Boolean value_2 = false;

	// Normal Way Approch
	@Test
	public void checkEqual() {
		if (name.equals("Jack")) {
			System.out.println("Name is Equal");
		} else {
			System.out.println("Name is Not Equal");

		}
	}

	// Using Assert
	@Test
	public void usingAssert() {
		Assert.assertEquals(name, "Jack");
		Assert.assertNotEquals(name, "jack");
		Assert.assertTrue(value_1, "This should be true");
		Assert.assertFalse(value_2, "This should Not be true");

	}
}
