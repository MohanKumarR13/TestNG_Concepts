package com.testng.setpriority;

import org.testng.annotations.Test;

public class Priority_TestNG {
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
}
