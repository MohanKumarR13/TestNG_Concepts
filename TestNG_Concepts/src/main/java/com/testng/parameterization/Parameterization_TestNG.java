package com.testng.parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_TestNG {
@Test
@Parameters("Name")
public void printName(String name) {
	System.out.println("Name is : " +name);
}
}
