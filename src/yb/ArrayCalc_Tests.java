package yb;

import static org.junit.Assert.*;

import org.junit.*;

public class ArrayCalc_Tests {
	
	private ArrayCalc arrayCalc;
	
	@Test
	// this is a basic test to get the sum of a list of numbers
	public void getSumReturnsSum() {
		int[] intArr = {1, 2, 3, 4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(10, arrayCalc.getSum(intArr));
	}
	
	@Test
	// this test checks if the getSum funtion can handle negative values
	public void getSumIncludesNegatives() {
		int[] intArr = {1, -2, 3, -4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(-2, arrayCalc.getSum(intArr));
	}
	
	@Test
	// this test checks that no error occurs when an empty array is given
	// personally I think an error should be thrown, but that is not the point
	public void emptyArrayReturns0() {
		int[] intArr = {}; 
		arrayCalc = new ArrayCalc();
		assertEquals(0, arrayCalc.getSum(intArr));
	}
	
	@Test
	// this is a basic test to get the max of a list of numbers
	public void getMaxValueReturnsMax() {
		int[] intArr = {1, 2, 3, 4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(4, arrayCalc.getMaxValue(intArr));
	}
	
	@Test
	// this test checks if the getMaxValue function can handle duplicate values
	public void getMaxValueOfDuplicates() {
		int[] intArr = {1, 2, 4, 4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(4, arrayCalc.getMaxValue(intArr));
	}
	
	@Test
	// this test checks that the getMaxValue function works on a list of negative numbers
	public void GetMaxValueOfOnlyNegativeNumbers() {
		int[] intArr = {-1, -2, -3, -4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(-1, arrayCalc.getMaxValue(intArr));
	}
	
	@Test
	// this test checks that the getMaxValue function works on a list with only one value
	public void GetMaxValueOfOnlyOneValue() {
		int[] intArr = {5}; 
		arrayCalc = new ArrayCalc();
		assertEquals(5, arrayCalc.getMaxValue(intArr));
	}
	
	@Test
	// this is a basic test to get the min of a list of numbers
	public void getMinValueReturnsMin() {
		int[] intArr = {5, 2, 3, 4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(1, arrayCalc.getMinValue(intArr));
	}
	
	@Test
	// this test checks if the getMinValue function can calculate the min
	// value when it is the first value in the array
	public void getMinValueWhenFirstIsTheLowest() {
		int[] intArr = {1, 2, 3, 4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(1, arrayCalc.getMinValue(intArr));
	}
	
	@Test
	// this test checks that the getMinValue function will return 0 when it is th min
	public void GetMinValueOf0() {
		int[] intArr = {1, 2, 3, 0}; 
		arrayCalc = new ArrayCalc();
		assertEquals(0, arrayCalc.getMinValue(intArr));
	}
	
	@Test
	// this is a basic test to get the range of a list of numbers
	public void getRangeReturnsRange() {
		int[] intArr = {1, 2, 3, 4}; 
		arrayCalc = new ArrayCalc();
		assertEquals(3, arrayCalc.getRange(intArr));
	}
	
	@Test
	// this test checks if the getRange function will return 0 for an array of duplicate values
	public void getRangeOfDuplicatesReturns0() {
		int[] intArr = {2, 2}; 
		arrayCalc = new ArrayCalc();
		assertEquals(0, arrayCalc.getRange(intArr));
	}
	
	@Test
	// this test checks that the getRange function will return 0 when the length of the array is 1
	public void GetRangeOfOneValue() {
		int[] intArr = {1}; 
		arrayCalc = new ArrayCalc();
		assertEquals(0, arrayCalc.getRange(intArr));
	}

}
