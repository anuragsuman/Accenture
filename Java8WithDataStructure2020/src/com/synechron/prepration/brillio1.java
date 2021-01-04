package com.synechron.prepration;
@FunctionalInterface
interface Test{
	public abstract int m1(int a, int b);
} 
public class brillio1 implements Test{
	
	public int m1(int a, int b){
		return b;
	}
	
	public static void main(String args[]) {
		Test t = (a,b)->a*b;
		System.out.println(t.m1(4, 4));
	}
}
