package io.vlabs.testng.testdata;

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

public class TC_002 {

	@BeforeSuite
	public void method2() {
		System.out.println("Before Suite2 method");
	}

	@BeforeTest
	public void method5() {
		System.out.println("\tBefore Test2 method");
	}

	@BeforeClass
	public void method1() {
		System.out.println("\t\tBefore Class2 method");
	}

	@BeforeGroups
	public void method3() {
		System.out.println("Before Groups2 method");
	}

	@BeforeMethod
	public void method4() {
		System.out.println("\t\t\tBefore Method2 method");
	}

	@Test
	public void method6() {
		System.out.println("\t\t\t\tTest2");
	}

	@Test
	public void method12() {
		System.out.println("\t\t\t\tNew Test2");
	}

	@AfterMethod
	public void method10() {
		System.out.println("\t\t\tAfter Method2 method");
	}

	@AfterClass
	public void method7() {
		System.out.println("\t\tAfter Class2 method");
	}

	@AfterTest
	public void method11() {
		System.out.println("\tAfter Test2 method");
	}

	@AfterSuite
	public void method8() {
		System.out.println("After Suite2 method");
	}

	@AfterGroups
	public void method9() {
		System.out.println("After Groups2 method");
	}

}
