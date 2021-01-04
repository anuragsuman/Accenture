package com.job.interview.incture;

public class TryCatchFinallyAndStringQuery {

	     public static void main(String []args){
	        String s1 = "abc";
	        String s2 = "def";
	        try {
	            System.out.println(s1 + s2);
	            System.out.println(s1);
	            StringBuffer s3 = new StringBuffer(s1);
	            s3.append(s2);
	            System.out.println(s3);
	            s1 = s1 + Integer.parseInt(s2);
	            System.out.println(s1);
	            } catch (NumberFormatException ne){
	                System.out.println("NumberFormatException exception occurred");
	            }catch (Exception e) {
	                System.out.println("Base exception occurred");
	            }  finally {
	                System.out.println("Entered finally block");
	            }
	        
	     }
}
