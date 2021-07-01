package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * RoomManager RM = new RoomManager(); RM.init(); Scanner UserInput = new
		 * Scanner(System.in); String selection = ""; Room CurrentRoom =
		 * RM.StartingRoom; do { System.out.println(CurrentRoom.getName());
		 * System.out.println("Where would you like to go?"); selection =
		 * UserInput.nextLine(); Room next = CurrentRoom.getExit(selection); if(next !=
		 * null) { CurrentRoom = next; } } while(!selection.equals("quit")); }
		 */
		RoomManager rm = new RoomManager();
		rm.init();
		Player player = new Player(rm.StartingRoom);
		while (true) {
			// printRoom(player);
			System.out.println("Welcome to the mansion. You are currently at: \n");
			printRoom(player);
			System.out.println("\n");
			System.out.println("Where would you like to go? \n");
			String[] usein = collectInput();
			//printRoom(player);
			parse(usein, player);
		}
	}

	private static void printRoom(Player player) {
		System.out.println(player.CurrentRoom.getName());
		//System.out.println(player.CurrentRoom.getLongDescription());
		System.out.println(player.CurrentRoom.getShortDescription());
		//player.CurrentRoom.getExits();
		System.out.println("\n");
		
		if(player.getCurrentRoom().getExit("north") != null) {
			System.out.println("North: " + player.getCurrentRoom().getExit("north").getShortDescription() + "\n");
		}
		if(player.getCurrentRoom().getExit("south") != null) {
			System.out.println("South: " + player.getCurrentRoom().getExit("south").getShortDescription() + "\n");
		}
		if(player.getCurrentRoom().getExit("east") != null) {
			System.out.println("East: " + player.getCurrentRoom().getExit("east").getShortDescription() + "\n");
		}
		if(player.getCurrentRoom().getExit("west") != null) {
			System.out.println("West: " + player.getCurrentRoom().getExit("west").getShortDescription());
		}
	}


	private static String[] collectInput() {
		Scanner UserInput = new Scanner(System.in);
		String input = UserInput.nextLine();
		String[] cmd = input.split(" ");
		return cmd;
	}

	private static void parse(String[] command, Player player) {
		if (command[0].equals("quit")) {
			System.out.println("Thank you for playing.");
			System.exit(0);
		}
		switch (command[0]) {
		case "south":
			player.setCurrentRoom(player.getCurrentRoom().getExit("south"));
			break;
		case "north":
			player.setCurrentRoom(player.getCurrentRoom().getExit("north"));
			break;
		case "west":
			player.setCurrentRoom(player.getCurrentRoom().getExit("west"));
			break;
		case "east":
			player.setCurrentRoom(player.getCurrentRoom().getExit("east"));
			break;
		}
	}
}
