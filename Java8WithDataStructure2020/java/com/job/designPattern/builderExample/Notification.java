package com.job.designPattern.builderExample;

import java.util.ArrayList;
import java.util.List;

public class Notification {
	List<PersonNotify> personList = new ArrayList<>(); 
	
	public void notifies() {
		for (PersonNotify notices : personList) {
			notices.sendMessage();
		}
	}
	
}
