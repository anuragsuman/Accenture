package com.job.designPattern.bridgePattern;

public class ShortMessage extends Message{

	public ShortMessage(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	@Override
	void sendMessage(String message) {
		messageSender.sendMessage(message);
	}
}
