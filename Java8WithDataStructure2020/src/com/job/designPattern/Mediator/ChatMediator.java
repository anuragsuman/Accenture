package com.job.designPattern.Mediator;

public interface ChatMediator{
	public void sendMessage(String message, User user);

	public void addUser(User user);
}

