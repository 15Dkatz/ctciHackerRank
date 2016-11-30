package ctciHackerrank;

import java.util.ArrayList;
import java.util.Scanner;

// Recursion : Stairs

public class Stairs {

	public static int paths(int number) {
		ArrayList<Integer> differences = new ArrayList<Integer>();
		differences.add(1);
		differences.add(2);
		differences.add(4);
		if (number <= 3) {
			return differences.get(number - 1);
		} else {
			int i = 3;
			while (i < number) {
				differences.add(differences.get(i - 1) + differences.get(i - 2) + differences.get(i - 3));
				i++;
			}
			return differences.get(number - 1);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		for (int a0 = 0; a0 < s; a0++) {
			int n = in.nextInt();
			System.out.println(paths(n));
		}
	}
}
