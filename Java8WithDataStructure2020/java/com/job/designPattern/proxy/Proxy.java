package com.job.designPattern.proxy;

public class Proxy implements Image{
	
	RealImage realImage;
	String fileName;

	public Proxy(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}


}
