package ctciHackerrank;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BalancedStacks {
	public static boolean isBalanced(String expression) {
		// odd length expressions cannot be balanced
		if (expression.length() % 2 != 0) {
			return false;
		}

		HashMap<Character, Character> pairs = new HashMap<Character, Character>();
		pairs.put('(', ')');
		pairs.put('[', ']');
		pairs.put('{', '}');

		Stack<Character> charStack = new Stack<Character>();

		for (Character letter : expression.toCharArray()) {
			if (charStack.isEmpty() || pairs.get(charStack.peek()) != letter) {
				// System.out.println("push this letter " + letter);
				charStack.push(letter);
			} else {
				// System.out.println("pop this letter " + letter);
				charStack.pop();
			}
		}

		return charStack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			if (answer)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
