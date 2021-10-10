package question1;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	//Main Method
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the brackets String: ");
		String brackets = scanner.next();

		if (checkBalanced(brackets))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");
		scanner.close();
	}

	// Checking balanced or unbalanced
	private static boolean checkBalanced(String brackets) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < brackets.length(); i++) {
			char ch = brackets.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (!stack.empty()) {
					char popch = stack.pop();

					switch (ch) {
					case ')':
						if (popch != '(')
							return false;
						break;
					case '}':
						if (popch != '{')
							return false;
						break;
					case ']':
						if (popch != '[')
							return false;
						break;
					}
				} else {
					return false;
				}
			}
		}
		return stack.empty();
	}

}
