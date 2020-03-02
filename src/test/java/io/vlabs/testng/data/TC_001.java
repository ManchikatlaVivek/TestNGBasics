package io.vlabs.testng.data;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_001 {

	@BeforeSuite
	public void method2() {
		System.out.println("Before Suite method");
	}

	@BeforeTest
	public void method5() {
		System.out.println("\tBefore Test method");
	}

	@BeforeClass
	public void method1() {
		System.out.println("\t\tBefore Class method");
	}

	@BeforeGroups
	public void method3() {
		System.out.println("Before Groups method");
	}

	@BeforeMethod
	public void method4() {
		System.out.println("\t\t\tBefore Method method");
	}

	@Test
	public void method6() {
		System.out.println("\t\t\t\tTest method");
	}

	@Test
	public void method12() {
		System.out.println("\t\t\t\tNew Test method");
	}

	@AfterMethod
	public void method10() {
		System.out.println("\t\t\tAfter Method method");
	}

	@AfterClass
	public void method7() {
		System.out.println("\t\tAfter Class method");
	}

	@AfterTest
	public void method11() {
		System.out.println("\tAfter Test method");
	}

	@AfterSuite
	public void method8() {
		System.out.println("After Suite method");
	}

	@AfterGroups
	public void method9() {
		System.out.println("After Groups method");
	}

}
