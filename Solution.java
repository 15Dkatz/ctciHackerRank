package ctciHackerrank;

import java.util.Scanner;

public class Solution {

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			int halfPoint = n / 2;
			int i = 2;
			while (i <= halfPoint) {
				double checkNum = (double) n / i;
				// System.out.println("checkNum " + checkNum + " i: " + i);
				double flooredNum = Math.floor(checkNum);
				if (checkNum == flooredNum) {
					return false;
				}
				halfPoint = (int) Math.floor(flooredNum);
				i++;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			String statement = isPrime(n) ? "Prime" : "Not prime";
			System.out.println(statement);
		}
	}
}
