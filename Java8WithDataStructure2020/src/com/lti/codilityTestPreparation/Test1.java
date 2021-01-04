package com.lti.codilityTestPreparation;

public class Test1 {
	
	String solution(String S) {
		int[] occurrences = new int[256];
		for (char ch : S.toCharArray()) {
			occurrences[ch - 'a']++;
		}

		char best_char = 'a';
		int  best_res  = 0;

		for (int i = 1; i < 26; i++) {
			if (occurrences[i] == best_res) {
				best_char = (char)((int)'a' + i);
				best_res  = occurrences[i];
				best_res++;
			}
		}
		return Character.toString(best_char);
	}

	String solution1(String str) {
		int count[] = new int[256]; 

		int len = str.length(); 
		for (int i=0; i<len; i++) 
			count[str.charAt(i)]++; 

		int max = -1;  
		char result = ' ';   

		for (int i = 0; i < len; i++) { 
			if (max < count[str.charAt(i)]) { 
				max = count[str.charAt(i)]; 
				result = str.charAt(i); 
			} 
		} 

		return result+"";
	}
	public static void main(String args[]) {
		
		Test1 test = new Test1();
		System.out.println(test.solution("helloaa"));
	}
}
