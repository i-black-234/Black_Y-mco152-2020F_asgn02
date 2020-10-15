package yb;

public class ArrayCalc {
	
	public int getSum(int[] arr) {
		if (arr.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		int sum = 0;
		
		for (int i : arr) {
			sum += i;
		}
		
		return sum;
	}
	
	public int getMaxValue(int[] arr) {
		if (arr.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max)
				max = i;
		}
		return max;
	}
	
	public int getMinValue(int[] arr) {
		if (arr.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		int min = Integer.MAX_VALUE;
		for (int i : arr) {
			if (i < min)
				min = i;
		}
		return min;
	}
	
	public int getRange(int[] arr) {
		if (arr.length == 0) {
			throw new IndexOutOfBoundsException();
		}
		return getMaxValue(arr) - getMinValue(arr);
	}
	
}
