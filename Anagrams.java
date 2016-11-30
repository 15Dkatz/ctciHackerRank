package ctciHackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
	// converts a string to a map of character counts
	public static HashMap<Character, Integer> stringMap(String string) {
		HashMap<Character, Integer> stringMap = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			Character nextChar = string.charAt(i);
			if (!stringMap.containsKey(nextChar)) {
				stringMap.put(nextChar, 1);
			} else {
				stringMap.put(nextChar, stringMap.get(nextChar) + 1);
			}
		}
		return stringMap;
	}

	public static int numberNeeded(String first, String second) {
		int deletions = 0;
		HashMap<Character, Integer> stringMap1 = stringMap(first);
		HashMap<Character, Integer> stringMap2 = stringMap(second);

		for (Character nextChar : stringMap1.keySet()) {
			if (stringMap2.containsKey(nextChar)) {
				int difference = stringMap1.get(nextChar) - stringMap2.get(nextChar);
				difference = difference > 0 ? difference : difference * -1;
				deletions += difference;
				stringMap2.remove(nextChar);
			} else {
				deletions += stringMap1.get(nextChar);
			}
		}

		for (Character nextChar : stringMap2.keySet()) {
			deletions += stringMap2.get(nextChar);
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
