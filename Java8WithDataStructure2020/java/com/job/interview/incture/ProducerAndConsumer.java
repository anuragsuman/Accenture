package com.job.interview.incture;

import java.util.ArrayList;

// class Test3 extends Thread{
//	 
//	
//	 
//	 public synchronized ArrayList<String>  publisher(ArrayList<String> arry) throws InterruptedException {
//		 if(arry.size() > 2) {
//			 //remove
//			 System.out.println("waiting for subscribe ");
//			 wait();
//		 }
//		 notify();
//		
//			
//	 }
//	 
//	 public static synchronized ArrayList<String>  subscribe(ArrayList<String> arry) throws InterruptedException {
//		 if(arry == null) {
//			 //push
//			 wait();
//		 }
//		 notify();
//		 System.out.println("subscribe");
//	 }
//	 
//	 public static void main(String args[]) {
//		 
//		 ArrayList<String> arry = new ArrayList<String>();
//		
//		 
//		 new Thread(new Runnable() {
//			 public void run() {
//				 try {
//					new Test3().publisher(arry);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			 };
//		 }).start();
//		 
//		 new Thread(new Runnable(){
//			 @Override
//			 public void run() {
//				 try {
//					Test3.subscribe(arry);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			 };
//		 }).start();
//		 
//		 
//	 }
//	 
// }