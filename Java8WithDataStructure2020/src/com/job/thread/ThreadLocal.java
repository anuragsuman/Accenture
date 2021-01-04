package com.job.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

//class ThreadLocalExample {
//	
//	public static ThreadLocal<SimpleDateFormat> dateFormatter =
//			new ThreadLocal<SimpleDateFormat>(() {
//		@Override
//		protected SimpleDateFormat initialValue() {
//			return new SimpleDateFormat("yyyy-MM-dd");
//		}
//		
//		@Override
//		protected SimpleDateFormat get() {
//			return super.get();
//		}
//	});
//}
public class ThreadLocal {
//	public static void main(String[] args) {
//		for(int i =0; i<1000;i++) {
//			int id=i;
//			String birthDate = birthDate(id);
//			System.out.println(birthDate);
//		}
//		Thread.sleep(1000);
//	}
//
//	public static String birthDate(int userID) {
//		Date birthDate = birthDateFromDB(userID);
//		final SimpleDateFormat df = new ThreadLocalExample.dateFormatter.get();
//		return df.format(birthDate);
//	}

}
