package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int tam= Utils.integer("Dime el tamaño del array: ");
		int[] array = createAndInitializeArray(tam);
		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int num) {
		int[] array = new int[num];

		for (int i = 0; i < num; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);

			if (i < nums.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
