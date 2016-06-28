package com.battula.srinivas;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple DeDup.
 */
public class DeDupTest {
	/**
	  * Random Integers for test case.
	  */
	 public static int[] randomInts = { 1, 2, 34, 34, 25, 1, 45, 3, 26,
	   85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20,
	   17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10,
	   14, 20, 17, 16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20,
	   7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	/**
	 * Random Integers for test case.
	 */
	public static Integer[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26,
			85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20,
			17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10,
			14, 20, 17, 16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20,
			7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	/**
	 * Random Floats for test case.
	 */
	public static Float[] randomfloats = { 1.2f, 2.3f, 3.4f, 2.3f, 4.5f, 6.7f,
			4.5f, 8.6f, 9.0f, 4.0f, 4.0f, 1.2f, 2.3f };

	/**
	 * Array with Zero integers
	 */
	public static Integer[] zeroArray = {};
	/**
	 * One Element Array
	 */
	public static Integer[] oneElementArray = { 1234567890 };

	/**
	 * Test cas to test Zero elements in given order.
	 */
	@Test
	public void zeroElementArrayTest() {
		final DeDup<Integer> ints = new DeDup<Integer>(zeroArray);
		Assert.assertArrayEquals("Failure Occrred", zeroArray,
				ints.distinctElements(Integer.class));
	}

	/**
	 * Test cas to test Zero elements in sort order.
	 */
	@Test
	public void zeroElementArraySortOrderTest() {
		final DeDup<Integer> ints = new DeDup<Integer>(zeroArray);
		Assert.assertArrayEquals("Failure Occrred", zeroArray,
				ints.distinctSortedElements(Integer.class));
	}

	/**
	 * Test cas to test Zero elements in given order.
	 */
	@Test
	public void oneElementArrayTest() {
		final DeDup<Integer> ints = new DeDup<Integer>(oneElementArray);
		Assert.assertArrayEquals("Failure Occrred", oneElementArray,
				ints.distinctElements(Integer.class));
	}

	/**
	 * Test cas to test Zero elements in sort order.
	 */
	@Test
	public void oneElementArraySortOrderTest() {
		final DeDup<Integer> ints = new DeDup<Integer>(oneElementArray);
		Assert.assertArrayEquals("Failure Occrred", oneElementArray,
				ints.distinctSortedElements(Integer.class));
	}

	/**
	 * positive testcase for testing elements in given order.
	 */
	@Test
	public void eleminateDuplicateIntegersAndDisplayInsertionOrderArrayTest() {
		final DeDup<Integer> ints = new DeDup<Integer>(randomIntegers);
		final Integer[] expectedIntArray = { 1, 2, 34, 25, 45, 3, 26, 85, 4,
				86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14,
				12, 13, 7 };
		Assert.assertArrayEquals("Failure Occrred", expectedIntArray,
				ints.distinctElements(Integer.class));
	}

	/**
	 * Positive testcase for testing elements in sorting order.
	 */
	@Test
	public void eleminateDuplicateIntegersAndDisplaySortedOrderArrayTest() {
		final DeDup<Integer> ints = new DeDup<Integer>(randomIntegers);
		final Integer[] expectedIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
				12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 34, 43, 45, 85, 86,
				10000 };
		Assert.assertArrayEquals("Failure Occrred", expectedIntArray,
				ints.distinctSortedElements(Integer.class));
	}

	/**
	 * Positive testcase for float numbers in given order.
	 */
	@Test
	public void eleminateDuplicateFloatsAndDisplayInsertionOrderArrayTest() {
		final DeDup<Float> floats = new DeDup<Float>(randomfloats);
		final Float[] expectedFloatArray = { 1.2f, 2.3f, 3.4f, 4.5f, 6.7f,
				8.6f, 9.0f, 4.0f };
		Assert.assertArrayEquals("Failure Occrred", expectedFloatArray,
				floats.distinctElements(Float.class));
	}

	/**
	 * Positive testcase for float numbers in sorted order.
	 */
	@Test
	public void eleminateDuplicateFloatsAndDisplaySortedOrderArrayTest() {
		final DeDup<Float> floats = new DeDup<Float>(randomfloats);
		final Float[] expectedFloatOrderedArray = { 1.2f, 2.3f, 3.4f, 4.0f,
				4.5f, 6.7f, 8.6f, 9.0f };
		Assert.assertArrayEquals("Failure Occrred", expectedFloatOrderedArray,
				floats.distinctSortedElements(Float.class));
	}
	
	public static Integer[] toObject(int[] intArray) {

		  Integer[] result = new Integer[intArray.length];
		  for (int i = 0; i < intArray.length; i++) {
		   result[i] = Integer.valueOf(intArray[i]);
		  }
		  return result;

		 }
	
		/**
		  * positive testcase for testing elements in given order.
		  */
		 @Test
		 public void eleminateDuplicateIntsAndDisplayInsertionOrderArrayTest() {
		  final DeDup<Integer> ints = new DeDup<Integer>(toObject(randomInts));
		  final Integer[] expectedIntArray = {1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7};
		  Assert.assertArrayEquals("Failure Occrred", expectedIntArray, ints.distinctElements(Integer.class));
		 }

}
