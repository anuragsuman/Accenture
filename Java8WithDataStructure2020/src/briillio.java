	class Test12 { 
	    static int i; 
	    int j; 
	    static { 
	        i = 10; 
	        System.out.println("World "); 
	    } 
	    Test12(){ 
	        System.out.println("Hello"); 
	    } 
	} 
	  

public class briillio {
	    public static void main(String args[]) { 
	  
	       Test12 t1 = new Test12(); 
	       Test12 t2 = new Test12(); 
	    } 
	} 
