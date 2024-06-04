package com.nimap.junit.JunitDemo.serviceTest;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AsserstionLearning {

	// Assertion :- validating actual result with expected result

	// assertArrayEquals >> to compare arrays

	@Test
	public void test() {

		int[] actualArray = { 1, 2, 3, 4, 5 };
		int[] expectedArray = { 1, 2, 3, 4, 5, 6 };

		Assertions.assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void test1() {
		// Referring to same object or not
		// String actual = new String ("durgesh"); CASE1
		// String expected= new String ("durgesh"); CASE1

		String actual = "durgesh"; // CASE2
		String expected = "durgesh";// CASE2

		Assertions.assertSame(expected, actual);
	}

	@Test
	public void test3() {

		Boolean actual = false;

		Assertions.assertTrue(actual); // it check actual true or not
	}

	@Test
	public void test4() {

		List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

		Assertions.assertIterableEquals(expected, actual); // now we comparing collections
		// values and sequence should be same
	}

	@Test
	public void test5() {

		Assertions.assertThrows(RuntimeException.class, () -> {
			throw new RuntimeException();
		});
		// This method is used to assert that the executable (a piece of code) throws an
				// exception of the specified type.
	}

}
