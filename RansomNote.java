package ctciHackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote {

	// TODO add documentation
	public static Boolean canRansom(String[] m, String[] r) {
		// create a HashSet of m
		HashMap<String, Integer> mWords = new HashMap<String, Integer>();
		for (int i = 0; i < m.length; i++) {
			if (!mWords.containsKey(m[i])) {
				mWords.put(m[i], 1);
			} else {
				mWords.put(m[i], mWords.get(m[i]) + 1);
			}

		}

		for (int i = 0; i < r.length; i++) {
			if (mWords.containsKey(r[i]) == false) {
				return false;
			} else {
				if (mWords.get(r[i]) < 1) {
					return false;
				}
				mWords.put(r[i], mWords.get(r[i]) - 1);

			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}

		if (canRansom(magazine, ransom)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}
}