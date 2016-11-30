package ctciHackerrank;

import java.util.Scanner;

//5 4
//1 2 3 4 5

//5 1 2 3 4

public class arrayLeftRotation {
	/**
	 * Rotate the array left 1 time
	 *
	 * @param array
	 * @return the rotated array
	 */
	public static int[] leftRotate(int[] array) {
		int[] newArr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				newArr[i] = array[0];
			} else {
				newArr[i] = array[i + 1];
			}
		}
		array = newArr;
		return array;
	}

	/**
	 * Rotate the array by a number of rotations through recursion
	 *
	 * @param array
	 * @param rotations
	 * @return the rotated array
	 */
	public static int[] multiLeftRotate(int[] array, int rotations) {
		for (int i = 0; i < rotations; i++) {
			array = leftRotate(array);
		}
		return array;
	}

	/**
	 * print the array
	 *
	 * @param array
	 */
	public static void print(int[] array) {
		for (int p = 0; p < array.length; p++) {
			System.out.print(array[p] + " ");
		}
	}

	/**
	 * Quick rotation of the array
	 *
	 * @param array
	 * @param rotations
	 * @return the array
	 */
	public static int[] quickRotate(int[] array, int rotations) {
		int[] newArr = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			int newPosition = i - rotations;
			if (newPosition < 0) {
				newPosition += array.length;
			}
			newArr[newPosition] = array[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		a = quickRotate(a, k);
		print(a);
		in.close();
	}
}
