package com.job.interview;

public class TryCatchFinally {
	
	public static int m1() throws Exception {
		try {
			return 10/0;
		}catch(Exception e) {
			throw new Exception("abc");
		}finally {
			return 3;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(TryCatchFinally.m1());
	
	}
}
