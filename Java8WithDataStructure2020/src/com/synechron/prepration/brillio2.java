package com.synechron.prepration;
import java.util.Arrays;
import java.util.stream.Collectors;

public class brillio2 {

	public static void main(String[] args) {
		String[] str  = {"Madhu", "Sandhya", "Pramod", "alex"};
		
		Arrays.asList(str).stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(e->System.out.println(e));

	}

}
