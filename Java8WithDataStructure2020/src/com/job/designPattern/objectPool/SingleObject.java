package com.job.designPattern.objectPool;

public class SingleObject {

	   //create an object of SingleObject
	    static SingleObject instance;
	   
	   static int poolSize =0;
	   

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}

	   //Get the only object available
	   public static SingleObject getInstance(){
		  while(poolSize<2) {
			  poolSize++;
			  return instance = new SingleObject();
		  }
		  return instance;
	   }

	   public String showMessage(){
	      return "Hello World!";
	   }
	}
