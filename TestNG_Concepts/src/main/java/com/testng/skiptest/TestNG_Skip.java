package com.testng.skiptest;

import org.testng.annotations.Test;

public class TestNG_Skip {
	@Test(priority = 0)
	public void carStart() {
		System.out.println("Car is Started");
	}

	@Test(priority = 1)
	public void gearOne() {
		System.out.println("Change Gear One");
	}

	@Test(priority = 2)
	public void gearTwo() {
		System.out.println("Change Gear Two");
	}

	@Test(priority = 3)
	public void gearThree() {
		System.out.println("Change Gear Three");
	}

	@Test(priority = 4)
	public void gearFour() {
		System.out.println("Change Gear Four");
	}

	@Test(priority = 5, enabled = false)
	public void musicOn() {
		System.out.println("Music ON");
	}
}
