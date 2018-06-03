//****************************************
// Elevator.java
// James Rangel
//****************************************

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args)
	{
		
		String elevatorEntry, elevatorDoors = "closed";
		int yourFloor = 0, elevatorFloor = 0, elevatorRide = 0;		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("What floor are you on? (0 (basement), 1, or 2): ");
		yourFloor = (scan.nextInt());
		if (yourFloor == 0) {
				yourFloor = 0;
		}
		else if (yourFloor == 1) {
			yourFloor = 1;
		}
		else if (yourFloor == 2) {
			yourFloor = 2;
		}
		System.out.println("Call the elevator. (up/down): ");
		elevatorEntry = (scan.next());
		if (elevatorEntry.equalsIgnoreCase("up") && yourFloor == 0) {
			elevatorFloor = 0;
			elevatorDoors = "open";
			System.out.println("The elevator doors open. Please enter.");
		}
		else if (elevatorEntry.equalsIgnoreCase("up") && yourFloor == 1) {
			elevatorFloor = 1;
			elevatorDoors = "open";
			System.out.println("The elevator is coming");
			System.out.println();
			System.out.println("The elevator has arrived. Please enter.");
		}
		else if (elevatorEntry.equalsIgnoreCase("up") && yourFloor == 2) {
			elevatorFloor = 2;
			elevatorDoors = "open";
			System.out.println("The elevator is coming");
			System.out.println();
			System.out.println("The elevator has arrived. Please enter.");
		}
		else if (elevatorEntry.equalsIgnoreCase("down") && yourFloor == 1) {
			elevatorFloor = 1;
			elevatorDoors = "open";
			System.out.println("The elevator is coming");
			System.out.println();
			System.out.println("The elevator has arrived. Please enter.");
		}
		else if (elevatorEntry.equalsIgnoreCase("down") && yourFloor == 2) {
			elevatorFloor = 2;
			elevatorDoors = "open";
			System.out.println("The elevator is coming");
			System.out.println();
			System.out.println("The elevator has arrived. Please enter.");
		}
		else {
			System.out.println("Please enter up or down.");
			elevatorEntry = (scan.next());
		}
		
		System.out.println();
		elevatorDoors = "closed";
		System.out.println("Please choose your destination. (0 (Basement), 1, or 2): ");
		elevatorRide = (scan.nextInt());
		if (elevatorRide == 0 && elevatorFloor == 1) {
			elevatorFloor = 0;
			yourFloor = 0;
			System.out.println("The elevator is going down.");
			System.out.println();
			elevatorDoors = "open";
			System.out.println("The elevator has arrived. Please exit.");
		}
		else if (elevatorRide == 0 && elevatorFloor == 2) {
			elevatorFloor = 0;
			yourFloor = 0;
			System.out.println("The elevator is going down.");
			System.out.println();
			elevatorDoors = "open";
			System.out.println("The elevator has arrived. Please exit.");
		}
		else if (elevatorRide == 1 && elevatorFloor == 0) {
			elevatorFloor = 1;
			yourFloor = 1;
			System.out.println("The elevator is going up.");
			System.out.println();
			elevatorDoors = "open";
			System.out.println("The elevator has arrived. Please exit.");
		}
		else if (elevatorRide == 1 && elevatorFloor == 2) {
			elevatorFloor = 1;
			yourFloor = 1;
			System.out.println("The elevator is going down.");
			System.out.println();
			elevatorDoors = "open";
			System.out.println("The elevator has arrived. Please exit.");
		}
		else if (elevatorRide == 2 && elevatorFloor == 0) {
			elevatorFloor = 2;
			yourFloor = 2;
			System.out.println("The elevator is going up.");
			System.out.println();
			elevatorDoors = "open";
			System.out.println("The elevator has arrived. Please exit.");
		}
		else if (elevatorRide == 2 && elevatorFloor == 1) {
			elevatorFloor = 2;
			yourFloor = 2;
			System.out.println("The elevator is going up.");
			System.out.println();
			elevatorDoors = "open";
			System.out.println("The elevator has arrived. Please exit.");
		}
		elevatorDoors = "closed";
		System.out.println("Thank you and have a great day.");
		System.out.println("You are now on floor " + yourFloor);
	}
}
