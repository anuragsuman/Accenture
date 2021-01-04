package com.synechron.prepration;
class Test1 { 
    static int i; 
    int j; 
   
    static synchronized void Test11(){ 
    	   synchronized(Test1.class){ 
    	        i = 10; 
    	        System.out.println("static block called "); 
    	    } 
        System.out.println("Constructor called"); 
    } 
} 
  
class Main { 
    public static void main(String args[]) { 
  
       // Although we have two objects, static block is executed only once. 
       Test1 t1 = new Test1();
       t1.Test11();
       t1.Test11();
       Test1 t2 = new Test1(); 
    } 
} 