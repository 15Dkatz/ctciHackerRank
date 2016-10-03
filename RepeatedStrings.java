package ctciHackerrank;

import java.math.BigDecimal;

//Sample Input 1
//
//a
//1000000000000
//Sample Output 1
//
//1000000000000

public class RepeatedStrings {
	/**
	 * Repeat the s string n times and count a's
	 *
	 * @param s
	 *            s whose value is the input string
	 * @param n
	 *            whose values is the number of times s repeats
	 * @return the number of a's in s.
	 */
	public static long aNum(String s, long n) {
		// you don't need to build a new string...
		// but you can repeat the string length up to n
		// multiply this number * the number of a's in the s
		// take the remainder and create a substring of s
		// add the number of a's in this substring to the original count
		String nonAs = s.replaceAll("[a]++", "");
		int numAs = s.length() - nonAs.length();

		long allAs = numAs * n / s.length();

		long subLength = n % s.length();
		// int intSL = new BigDecimal(subLength).intValueExact();
		int remainder = new BigDecimal(subLength).intValueExact();
		String subS = s.substring(0, remainder);
		subS = subS.replaceAll("[a]++", "");

		int lastAs = remainder - subS.length();
		// int trueAs = new BigDecimal(allAs).intValueExact();
		allAs += lastAs;

		return allAs;
	}

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// String s = in.next();
		// long n = in.nextLong();
		//
		// System.out.println(aNum(s, n));
		String testString = "hello|there";
		String[] testSplit = testString.split("[|]");
		for (int t = 0; t < testSplit.length; t++) {
			System.out.println("test splitted : " + testSplit[t]);
		}
	}
}
