package com.job.designPattern.state;

public class TVRemote {

	public static void main(String[] args) {

		StateOfLedTV on = new LEDTVOnState();
		LEDTVContext ledtvContext = new LEDTVContext();
		ledtvContext.setStateOfLedTV(on);
		
		ledtvContext.doTurnOnAndOff();
		
		StateOfLedTV off = new LEDTVOffState();
		ledtvContext.setStateOfLedTV(off);
		ledtvContext.doTurnOnAndOff();
		
		
	}

}
