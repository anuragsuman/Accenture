package com.job.designPattern.bridgePattern;

public class EmailSender implements MessageSender{
	
	@Override
	public void sendMessage(String message) {
		System.out.println(message + "::"+"Message sent through Email");
	}

}
