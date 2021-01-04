package com.job.tree;

public class Solution {
	//https://stackoverflow.com/questions/60494828/find-and-format-visually-aesthetically-pleasant-pattern-of-trees-in-a-forest-usi
	 public int solution(int[] a) {
	        if (isAesthetic(a)) {
	            return 0; //Edge Case completion for already aesthetic tree pattern.
	        }
	
	        int aestheticPatternCount = 0;
	        for (int j = 0; j < a.length; j++) {
	            int[] newA = copyArrayWithoutAnElement(a, j);
	            if (isAesthetic(newA)) {
	                aestheticPatternCount++;
	            }
	        }
	
	        if (aestheticPatternCount == 0) {
	            return -1;
	        } else {
	            return aestheticPatternCount;
	        }
	    }
	
	    private int[] copyArrayWithoutAnElement(int[] array, int indexOfElementToBeRemoved) {
	        int arrayLength = array.length;
	        int[] newArr = new int[arrayLength - 1];
	        int tempK = 0;
	        for (int k = 0; k < arrayLength; k++) {
	            if (k != indexOfElementToBeRemoved) {
	                newArr[tempK++] = array[k];
	            }
	        }
	        return newArr;
	    }
	
	    private boolean isAesthetic(int[] array) {
	        int newArrayLength = array.length;
	        int increasingFlag = 0;
	        for (int i = 0; i < newArrayLength; i++) {
	            if (increasingFlag == 0) {
	                if (array[i] < array[i + 1]) {
	                    increasingFlag = 1;
	                } else {
	                    increasingFlag = 2;
	                }
	            } else {
	                if (increasingFlag == 1) {
	                    if (i % 2 == 1 && array[i] > array[i - 1]) {
	
	                    } else if (i % 2 == 0 && array[i] < array[i - 1]) {
	
	                    } else {
	                        return false;
	                    }
	                } else {
	                    if (i % 2 == 1 && array[i] < array[i - 1]) {
	
	                    } else if (i % 2 == 0 && array[i] > array[i - 1]) {
	
	                    } else {
	                        return false;
	                    }
	                }
	            }
	        }
	        return true;
	    }
	
	    public static void main(String[] args) {
	        Solution solutionObj = new Solution();
	        int[] a1 = {1, 3, 1, 2};
	        int[] a2 = {3, 4, 5, 3, 7};
	        int[] a3 = {1, 2, 4, 4, 2, 5};
	        System.out.println(solutionObj.solution(a1));
	        System.out.println(solutionObj.solution(a2));
	        System.out.println(solutionObj.solution(a3));
	    }
}

