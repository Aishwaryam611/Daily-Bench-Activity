package com.arrays;

import java.util.Arrays;

public class InsertElementToSpecificPosition {

	public static void main(String[] args) {

		int[] my_array = { 1,2,4,5,743,9};

		// Insert an element in 3rd position of the array 

		int Index_position = 2;
		int newValue = 5;

		System.out.println("Original Array : " + Arrays.toString(my_array));

		for (int i = my_array.length - 1; i > Index_position; i--) {
			my_array[i] = my_array[i - 1];
		}
		my_array[Index_position] = newValue;
		System.out.println("New Array: " + Arrays.toString(my_array));
	}
}
