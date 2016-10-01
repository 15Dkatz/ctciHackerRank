package ctciHackerrank;

import java.util.HashMap;
import java.util.Scanner;

//Sample Input
//
//cde
//abc
//Sample Output
//
//4

public class Anagrams {
	public static int numberNeeded(String first, String second) {
		// char and count
		HashMap<Character, Integer> firstPairs = new HashMap<Character, Integer>();

		for (int i = 0; i < first.length(); i++) {
			Character nextChar = first.charAt(i);
			// System.out.println("next char" + nextChar);
			if (firstPairs.containsKey(nextChar) == false) {
				firstPairs.put(nextChar, 1);
			} else {
				firstPairs.put(nextChar, firstPairs.get(nextChar) + 1);
			}
		}

		HashMap<Character, Integer> secondPairs = new HashMap<Character, Integer>();

		for (int i = 0; i < second.length(); i++) {
			Character nextChar = second.charAt(i);
			if (secondPairs.containsKey(nextChar) == false) {
				secondPairs.put(nextChar, 1);
			} else {
				secondPairs.put(nextChar, secondPairs.get(nextChar) + 1);
			}
		}

		int deletions = 0;
		// do some counting
		for (Character key : firstPairs.keySet()) {
			// System.out.println("key get " + firstPairs.get(key));
			// for each key in firstPairs
			// check if the key is in second pairs
			if (secondPairs.containsKey(key)) {
				// System.out.println("contains key" + key);
				int difference = firstPairs.get(key) - secondPairs.get(key);

				// System.out.println("a" + firstPairs.get(key) + "b" +
				// secondPairs.get(key));
				if (difference < 0) {
					difference *= -1;
				}
				deletions += difference;
				// System.out.println("difference " + difference);
				secondPairs.remove(key);
			} else {
				deletions += firstPairs.get(key);
			}
		}

		// go through the second pairs and add to deletions
		for (Character key : secondPairs.keySet()) {
			deletions += secondPairs.get(key);
			// System.out.println("second key" + key);
		}

		return deletions;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
