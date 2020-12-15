package com.mgl.digital.sds.scrapper.algorithm;

import static org.junit.Assert.assertEquals;
import java.util.regex.*;
import org.junit.Test;

public class CountYZTest {
	public int countYZ(String str) { 
		int count = 0;
		Pattern regex = Pattern.compile("[yz](?!\\p{L})", Pattern.CASE_INSENSITIVE);
		Matcher regexMatcher = regex.matcher(str);
		while (regexMatcher.find()) {
			count++;
		} 
		return count;
	}

	@Test
	public void shouldPass() throws Exception {
		assertEquals(2, countYZ("fez day"));
		assertEquals(2, countYZ("day fez"));
		assertEquals(1, countYZ("day yak"));
		assertEquals(1, countYZ("day:yak"));
		assertEquals(2, countYZ("!!day--yaz!!"));
		assertEquals(2, countYZ("DAY abc XYZ"));
		assertEquals(3, countYZ("aaz yyz my"));
		assertEquals(2, countYZ("y2bz"));
		assertEquals(0, countYZ("zxyx"));
	}
}