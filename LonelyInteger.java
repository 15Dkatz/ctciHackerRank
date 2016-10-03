package ctciHackerrank;

import java.util.HashMap;
import java.util.Scanner;

// make a HashMap, and check which element has a count of 1. print that one

public class LonelyInteger {

	public static int findUnique(int[] a) {

		HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (numCounts.containsKey(a[i])) {
				numCounts.put(a[i], numCounts.get(a[i]) + 1);
			} else {
				numCounts.put(a[i], 1);
			}
		}

		for (int count : numCounts.keySet()) {
			if (numCounts.get(count) == 1) {
				return count;
			}
		}

		return a[0];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		System.out.println(findUnique(a));
	}
}
