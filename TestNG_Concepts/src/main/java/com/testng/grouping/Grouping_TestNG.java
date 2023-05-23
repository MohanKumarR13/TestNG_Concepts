package com.testng.grouping;

import org.testng.annotations.Test;

public class Grouping_TestNG {
	@Test(groups = "Apple")
	public void apple_1() {
		System.out.println("Apple Testing");
	}

	@Test(groups = "Apple")
	public void apple_2() {
		System.out.println("Apple Testing");
	}

	@Test(groups = "Moto")
	public void moto_1() {
		System.out.println("Moto Testing");

	}

	@Test(groups = "Moto")
	public void moto_2() {
		System.out.println("Moto Testing");

	}

	@Test(groups = "Vivo")
	public void vivo_1() {
		System.out.println("Vivo Testing");

	}

	@Test(groups = "Vivo")
	public void vivo_2() {
		System.out.println("Vivo Testing");

	}

	@Test(groups = "Lenovo")
	public void lenovo_1() {
		System.out.println("Lenovo Testing");

	}

	@Test(groups = "Lenovo")
	public void lenovo_2() {
		System.out.println("Lenovo Testing");

	}
}
