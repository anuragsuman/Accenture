package com.job.designPattern.builderExample;

public class NotificationBuilder {
	
	Gym gym;
	
	public static Notification builder(String joinAsMember) {
		Notification notification = null;
		if(joinAsMember.equalsIgnoreCase("Individual")) {
			notification = new Notification();
			notification.personList.add(new IndividualNotification());
		}else if(joinAsMember.equalsIgnoreCase("Trainer")) {
				notification = new Notification();
				notification.personList.add(new IndividualNotification());
				notification.personList.add(new TrainerNotification());
		}
		return notification;
	}

}
