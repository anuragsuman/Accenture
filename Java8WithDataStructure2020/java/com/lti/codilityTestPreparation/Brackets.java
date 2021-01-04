package com.lti.codilityTestPreparation;

import java.util.Stack;

public class Brackets {

	/*
    that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
	For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]",
	 the function should return 0, as explained above.
	 */

	public static void main(String args[]) {
		Brackets brackets = new Brackets();
		System.out.println(brackets.solution("[({}{})]"));
	}
	public int solution(String s) {

		if (s.length() % 2 != 0) {
			return 0;
		}

		Character openingBrace = new Character('{');
		Character openingBracket = new Character('[');
		Character openingParen = new Character('(');
		Stack<Character> openingStack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == openingBrace || c == openingBracket || c == openingParen) {
				openingStack.push(c);
			} else  {
				if (openingStack.isEmpty()) {
					return 0;
				}
				Character openingCharacter = openingStack.pop();
				switch (c) {
					case '}':
						if (!openingCharacter.equals(openingBrace)) {
							return 0;
						}
						break;
					case ']':
						if (!openingCharacter.equals(openingBracket)) {
							return 0;
						}
						break;
					case ')':
						if (!openingCharacter.equals(openingParen)) {
							return 0;
						}
						break;
	
					default:
						break;
				}
			} 
		}
		if (!openingStack.isEmpty()) {
			return 0;
		}

		return 1;

	}
}
