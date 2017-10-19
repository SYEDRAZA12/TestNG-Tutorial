package testClasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import appcode.SomeClassToTest;

public class TestNG_Asserts {
	@Test
	public void testSum() {
		System.out.println("\nRunnig Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		int result = obj.sumNumbers(4, 6);
		Assert.assertEquals(result, 10);

	}

	@Test
	public void testStrings() {
		System.out.println("\nRunnig Test-> testString");
		String expectedString = "Hello World";
		SomeClassToTest obj = new SomeClassToTest();
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}

	@Test
	public void testArrays() {
		System.out.println("\nRunnig Test -> testArrays");
		int[] expectedArray = { 1, 2, 3,4 };
		SomeClassToTest obj = new SomeClassToTest();
		int [] result = obj.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("\nEnd Test -> testArrays");
	}
}
