package Expt7;
import java.util.Scanner;

class Player {
	String NAME;
	String DOB;
	String STATE;
	Player(String name, String dateOfBirth, String state) { 
		NAME = name;
		DOB = dateOfBirth;
		STATE = state;
	}

	public void displayInfo() {
		System.out.println("Name: " + NAME);
		System.out.println("Date of Birth: " + DOB);
		System.out.println("State: " + STATE);
	}
}

class FootballPlayer extends Player {
	int Goals;
	
	public FootballPlayer(String name, String dateOfBirth, String state, int goals){ 
		super(name, dateOfBirth, state);
		Goals = goals;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Football Goals: " + Goals);
	}
}

class HockeyPlayer extends Player {
	int GOALS;
	
	public HockeyPlayer(String name, String dateOfBirth, String state, int goals){ 
		super(name, dateOfBirth, state);
		GOALS = goals;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Hockey Goals: " + GOALS);
	}
}

class CricketPlayer extends Player {
	int runs;
	int wickets;

	public CricketPlayer(String name, String dateOfBirth, String state, int runs, int wickets){ 
		super(name, dateOfBirth, state);
		this.runs = runs;
		this.wickets = wickets;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Cricket Runs: " + runs);
		System.out.println("Cricket Wickets: " + wickets);
	}
}

public class Inheritance {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nChoose the type of player to enter details for: ");
			System.out.println("1. Football Player");
			System.out.println("2. Hockey Player");
			System.out.println("3. Cricket Player");
			System.out.println("4. Exit");
					
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
					
			switch (choice) {
			case 1:
				// Input for Football Player
				System.out.print("Enter Name: ");
				String footballName = scanner.nextLine();
				
				System.out.print("Enter Date of Birth: ");
				String footballDOB = scanner.nextLine();
				
				System.out.print("Enter State: ");
				String footballState = scanner.nextLine();
				
				System.out.print("Enter Goals: ");
				int footballGoals = scanner.nextInt();
				scanner.nextLine();
				FootballPlayer fp = new FootballPlayer(footballName, footballDOB, footballState, footballGoals);
				System.out.println("\nFootball Player Information:"); 
				fp.displayInfo();
				break;
				
			case 2:
				// Input for Hockey Player
				System.out.print("Enter Name: ");
				String hockeyName = scanner.nextLine();
				
				System.out.print("Enter Date of Birth: "); 
				String hockeyDOB = scanner.nextLine();
				
				System.out.print("Enter State: "); 
				String hockeyState = scanner.nextLine();
				
				System.out.print("Enter Goals: ");
				int hockeyGoals = scanner.nextInt();
				scanner.nextLine();
				
				HockeyPlayer hp = new HockeyPlayer(hockeyName, hockeyDOB, hockeyState, hockeyGoals);
				System.out.println("\nHockey Player Information:"); 
				hp.displayInfo();
				break;
				
			case 3:
				// Input for Cricket Player
				System.out.print("Enter Name: ");
				String cricketName = scanner.nextLine();
				
				System.out.print("Enter Date of Birth: "); 
				String cricketDOB = scanner.nextLine();
				
				System.out.print("Enter State: "); 
				String cricketState = scanner.nextLine();
				
				System.out.print("Enter Runs: ");
				int cricketRuns = scanner.nextInt();
					
				System.out.print("Enter Wickets: "); 
				int cricketWickets = scanner.nextInt();
				scanner.nextLine();
				
				CricketPlayer cp = new CricketPlayer(cricketName, cricketDOB, cricketState, cricketRuns, cricketWickets);
				System.out.println("\nCricket Player Information:"); 
				cp.displayInfo();
				break;
								
			case 4:
				// Exiting the program
				System.out.println("Exiting...");
				return;
						
			default:
				System.out.println("Invalid choice. Please select a valid option.");
				break;
			}
		}
	}
}