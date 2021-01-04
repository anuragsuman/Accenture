package com.job.designPattern.bridgePattern;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		System.out.println("Do you want to send 'longmessage' or 'shortmessage' ?");
		Scanner scanner = new Scanner(System.in);
		String messageType = scanner.next();

		System.out.println("Please enter the message you want to send");
		Scanner scanner1 = new Scanner(System.in);
		String message = scanner1.nextLine();

		if (messageType.equalsIgnoreCase("longmessage")){
			Message longMessage = new LongMessage(new EmailSender());
			longMessage.sendMessage(message);
		}else{
			Message shortMessage = new ShortMessage(new SMSSender());
			shortMessage.sendMessage(message);
		}
	}

}
