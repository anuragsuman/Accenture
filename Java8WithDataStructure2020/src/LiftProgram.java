import java.util.Scanner;

public class LiftProgram {

	public static void main(String[] args) {
		int currentFloor = 0;
		int WantToGo = 0;
		for(int i=0; i>=0;i++) {
			Scanner scn = new Scanner(System.in);
			if(i==0) {
				System.out.println("CurrentFloor:");
				currentFloor = scn.nextInt();
			}
			
			System.out.println("WantToGo:");
			WantToGo = scn.nextInt();
			
			
			if(WantToGo > currentFloor) {
				System.out.println("going up");
				goUp(WantToGo,currentFloor);
				currentFloor = WantToGo;
			}else if(WantToGo < currentFloor) {
				System.out.println("going down");
				goDown(WantToGo,currentFloor);
				currentFloor = WantToGo;
			}
			
		}
		
	}

	private static void goDown(int wantToGo, int currentFloor) {
		for(int i=currentFloor; i>=wantToGo ;i--) {
			System.out.println(i);
		}
		
	}

	private static void goUp(int wantToGo, int currentFloor) {
		for(int i=currentFloor; i<= wantToGo;i++) {
			System.out.println(i);
		}
	}
}