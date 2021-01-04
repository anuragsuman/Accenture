package com.job.designPattern.state;

public class LEDTVOnState implements StateOfLedTV{

	@Override
	public void doTurnOnAndOff() {
		System.out.println("LED TV is on");
	}

}
