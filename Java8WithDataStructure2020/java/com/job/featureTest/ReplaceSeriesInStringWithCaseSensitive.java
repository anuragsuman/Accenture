package com.job.featureTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSeriesInStringWithCaseSensitive {

	public static void main(String[] args) {
		
		
//		String str = "Introduction 1231 to  124 SeRies 1243 programming 34563 concepts 5455";
//		String Str1 = str.replaceAll("[S-sE-eR-rI-iE-eS-s]+", "Series");
//		System.out.println(Str1);
		
		String content = "This is a tutorial SeRies ";
		String patternString = ".*Series.";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(content);
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
		
		
		 String inputStr = "This is an SeRiEs. These are 33 (Thirty-three) apples";
	     String regexStr = "Series";         // pattern to be matched
	     String replacementStr = "Series";  // replacement pattern
	     Pattern patter = Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE);
	     Matcher matcher1 = patter.matcher(inputStr);
	     String outputStr = matcher1.replaceAll(replacementStr); // first match only
	     System.out.println(outputStr);
		
		
	
	}

}
