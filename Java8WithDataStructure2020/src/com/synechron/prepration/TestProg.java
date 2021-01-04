package com.synechron.prepration;
class ABCPrg{
	ABCPrg(){
		System.out.println(1);
	}
}
public class TestProg extends ABCPrg{
	TestProg(){
		System.out.println(2);
	}
	public static void main(String args[]) {
		ABCPrg testProg = new TestProg();

	}
}
