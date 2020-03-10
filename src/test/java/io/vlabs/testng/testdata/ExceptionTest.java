package io.vlabs.testng.testdata;

import org.testng.annotations.Test;


public class ExceptionTest {
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void testExceptions() {
		String a = "abcd";
		Integer.parseInt(a);
	}
}
