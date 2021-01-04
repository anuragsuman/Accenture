package com.job.designPattern.state;

public class LEDTVOffState implements StateOfLedTV {

	@Override
	public void doTurnOnAndOff() {
		System.out.println("LED TV is off");
	}

}
