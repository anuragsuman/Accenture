package com.job.designPattern.builderExample;

public class ClientMain {

	public static void main(String[] args) {
		
		Gym gym = new Trainer();
		
		Notification notification = NotificationBuilder.builder(gym.joinAsMemmber());
		
		notification.notifies();
	}

}
