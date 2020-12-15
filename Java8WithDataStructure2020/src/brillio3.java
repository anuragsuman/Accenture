class A { 
	static int i; 
	int j; 

	static { 
		i = 10; 
		System.out.println("Hello corona World"); 
	} 
} 

public class brillio3 { 
	public static void main(String args[]) { 
		System.out.println(A.i); 
	} 
} 