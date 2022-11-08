package com.greatlearning.dsa.problem1;

import java.util.Stack;

public class BalancedBrackets {

	public static boolean isStringBalanced(String bracketExpression) {

		Stack<Character> stk = new Stack<>();
		for (int i = 0; i < bracketExpression.length(); i++) {
			char ch = bracketExpression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stk.push(ch);
				continue;
			}
			if (stk.isEmpty()) {
				return false;
			}
			char c;
			switch (ch) {
			case '}':
				c = stk.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stk.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stk.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			default:
				break;

			}

		}

		return (stk.isEmpty());

	}

	public static void main(String[] args) {

		String bracketExpression = "([[{}]]))";
		boolean result = isStringBalanced(bracketExpression);
		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
}
