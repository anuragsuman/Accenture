package com.job.designPattern.builderExample;

public class TrainerNotification implements PersonNotify {

	@Override
	public void sendMessage() {
		System.out.println("Joined with Trainer");
	}

}
