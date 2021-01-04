package com.job.thread;

public class MainThreadWithoutChildThread {

	public static void main(String[] args) {

		new Runnable() {
			@Override
			public void run() {
				System.out.println("1"+Thread.currentThread().getName());

			}
		}.run();

		System.out.println("2"+Thread.currentThread().getName());
	}
}
