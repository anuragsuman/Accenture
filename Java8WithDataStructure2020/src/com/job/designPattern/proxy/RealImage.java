package com.job.designPattern.proxy;

public class RealImage implements Image {
	
	String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadRealImage(fileName);
	}

	@Override
	public void display() {
		System.out.println("Display image from Disk");
	}

	public void loadRealImage(String fileName) {
		System.out.println("Load image from Disk");
	}
}
