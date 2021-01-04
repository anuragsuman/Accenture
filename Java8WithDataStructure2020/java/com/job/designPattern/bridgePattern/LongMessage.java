package com.job.designPattern.bridgePattern;

public class LongMessage extends Message{
	
	public LongMessage(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	@Override
	void sendMessage(String message) {
		messageSender.sendMessage(message);
	}
	

	
}
