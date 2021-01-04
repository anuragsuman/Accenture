package com.job.designPattern.state;

public class LEDTVContext implements StateOfLedTV{
	
	StateOfLedTV stateOfLedTV;

	public StateOfLedTV getStateOfLedTV() {
		return stateOfLedTV;
	}

	public void setStateOfLedTV(StateOfLedTV stateOfLedTV) {
		this.stateOfLedTV = stateOfLedTV;
	}

	@Override
	public void doTurnOnAndOff() {
		System.out.println("Current State "+stateOfLedTV.getClass().getName());
		stateOfLedTV.doTurnOnAndOff();
	}

}
