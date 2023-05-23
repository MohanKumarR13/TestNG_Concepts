package com.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_TestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case is Going to Excecute");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case is Going to Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case is Going to Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case is Going to Skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Before Everything");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("After Everything");
	}

}
