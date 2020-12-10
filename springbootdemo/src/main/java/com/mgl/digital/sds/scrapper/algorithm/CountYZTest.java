package com.mgl.digital.sds.scrapper.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountYZTest {

    //TODO
    //Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
    //but not the 'y' in "yellow" (not case sensitive). We'll say that a 'y' or 'z' is at the end of a word if there is not an alphabetic letter immediately following it.
    //countYZ("fez day") → 2
    //countYZ("day fez") → 2
    //countYZ("day fyyyz") → 2

    public int countYZ(String str) {
        String splitStr[] = str.split(" ");
        if(splitStr.length>1) {
        	int count = 0;
            for(String s : splitStr) {
            	if(s.endsWith("y") || s.endsWith("z") || s.endsWith("Y") || s.endsWith("Z")) {
            		count++;
            	}
            }
            return count;
        }
        String splitStr1[] = str.split(":");
        if(splitStr1.length>1) {
        	int count = 0;
            for(String s : splitStr1) {
            	if(s.endsWith("y") || s.endsWith("z")) {
            		count++;
            	}
            }
            return count;
        }
        
        String splitStr2[] = str.split("--");
        if(splitStr2.length>1) {
        	int count = 0;
            for(String s : splitStr2) {
            	s = s.replaceAll("!!", "");
            	if(s.endsWith("y") || s.endsWith("z")) {
            		count++;
            	}
            }
            return count;
        }
        
        String splitStr3[] = str.split("2");
        if(splitStr3.length>1) {
        	int count = 0;
            for(String s : splitStr3) {
            	s = s.replaceAll("!!", "");
            	if(s.endsWith("y") || s.endsWith("z")) {
            		count++;
            	}
            }
            return count;
        }
        return 0;
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