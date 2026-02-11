// ArrayDemo.java
// Demonstrates one-dimensional and two-dimensional arrays in Java.

public class ArrayDemo {
	public static void main(String[] args) {
		// One-dimensional array
		int[] numbers = {1, 2, 3, 4, 5};
		// Enhanced for loop to print elements
		for (int num : numbers) {
			System.out.println(num);
		}

		// Two-dimensional array
		int[][] matrix = {
			{1, 2},
			{3, 4}
		};
		// Print element at [1][0]
		System.out.println("Matrix[1][0]: " + matrix[1][0]);
	}
}
