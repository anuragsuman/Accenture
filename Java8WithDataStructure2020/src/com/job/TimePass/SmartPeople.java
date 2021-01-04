package com.job.TimePass;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.HashSet;
import java.util.Set;

public class SmartPeople extends Thread {

	boolean isTrue = true;
	@Override
	public void run() {
		while (isTrue) {
			try {

				// These coordinates are screen coordinates
				int xCoord = 500;
				int yCoord = 500;

				Set<String> set = new HashSet<String>(); 

				// Use add() method to add elements into the Set 
				set.add("Geeks"); 
				set.add("4"); 

				// Displaying the Set 
				System.out.println("Set: " + set); 
				// Removing elements using remove() method 
				set.remove("Geeks"); 
				set.remove("4"); 
				// Move the cursor
				Robot robot = new Robot();
				robot.mouseMove(xCoord, yCoord);

			} catch (AWTException e) {
			}
		}
	}

	public static void main(String[] args) {

		SmartPeople nonStop = new SmartPeople();
		nonStop.start();

	}
}
