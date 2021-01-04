package com.job.designPattern.builderExample;

public class IndividualNotification implements PersonNotify{

	@Override
	public void sendMessage() {
		System.out.println("Joined as Individual");
	}

}
