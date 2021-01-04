package com.job.designPattern.bridgePattern;

public abstract class Message {
	
	MessageSender messageSender;
	
	abstract void sendMessage(String message);

}
