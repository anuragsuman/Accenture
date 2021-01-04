package com.lti.codilityTestPreparation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/discuss/interview-question/385306/DRWor-New-gradorOA-2019-Periods-of-stable-velocity
public class CodilityProblem2 {
	
	int stablePeriods(int[] nums) {
	    int ans = 0;
	    for (int i = 1; i < nums.length; i++) {
	        int length = 0;
	        int diff = nums[i] - nums[i - 1];
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] - nums[j - 1] != diff) break;
	            length++;
	        }
	        ans += (length * (length + 1))/2;
	        i += length;
	    }
	    return ans;
	}

	public int solution(int arr[]) {
		int[] pre = new int[arr.length];
		for(int i=1;i<arr.length;i++) {
			pre[i] = arr[i] - arr[i-1];
		}
		Set<List<Integer>> res = new HashSet<>();
		int tmp = 0, r = 0;
		for(;r<pre.length-1;r++) {
			tmp = r;
			while(tmp < pre.length-1 && pre[tmp] == pre[tmp+1]) {
				res.add(Arrays.asList(r, tmp+1));
				tmp++;
			}
		}
		return res.size();
	}
	public static void main(String[] args) {
		int[] arr = {-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
		System.out.println(new CodilityProblem2().solution(arr));
		int[] arr1 = {1,2,3,4,5,6};
		System.out.println(new CodilityProblem2().solution(arr1));
		int A[] = {1,3,5,7,9};
		System.out.println(new CodilityProblem2().solution(A));
	}

}
