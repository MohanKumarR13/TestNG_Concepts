package com.testng.dependencies;

import org.testng.annotations.Test;

public class Dependencies_TestNG {
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("High School");
	}

	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary");
	}

	@Test(dependsOnMethods = "higherSecondary")
	public void college() {
		System.out.println("College");
	}
}
