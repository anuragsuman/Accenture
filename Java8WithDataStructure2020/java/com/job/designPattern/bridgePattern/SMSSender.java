package com.job.designPattern.bridgePattern;

public class SMSSender implements MessageSender{

	@Override
	public void sendMessage(String message) {
		if(message.length() > 10) {
			System.out.println(message + "::"+"Not sent because length is high");
		}else {
			System.out.println(message + "::"+"Message sent through SMS");
		}
	}

}
