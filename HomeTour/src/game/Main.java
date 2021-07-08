package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Player player = new Player();
		RoomManager rooms = new RoomManager();
		rooms.init();
		player.setCurrentRoom(rooms.startingRoom);
		String userCommand = "";
		printRoom(player);	
		while(userCommand != "quit") {
				String[] command = collectInput(scanner);
				
				if(command.length == 1 && command[0].equalsIgnoreCase("leave")) {
					System.out.println("You have exited the home. See you next time!");
						break;
				}
						
				else if(command[0].equals("")) {
					System.out.println("Which way would you like to go? Left, Right or leave?");
					
				}else {
					parse(command, player);
					printRoom(player);	

				}
			
	}
		}
		
	private static String[] collectInput(Scanner scanner) {
		String userCommand = scanner.nextLine(); 
		String[] commandArray = userCommand.split(" ");
		return commandArray;

	}
	private static void parse(String[] command, Player player) {
		if(command.length == 1 && command[0].equalsIgnoreCase("left")) {
			Room currentRoom = player.getCurrentRoom();
			Room nextRoom = currentRoom.getExit("left");
			if(nextRoom != null)
				player.setCurrentRoom(nextRoom);
			else 
				System.out.println("You are still in the same room.");
		}else if(command.length == 1 && command[0].equalsIgnoreCase("right")) {
			Room currentRoom = player.getCurrentRoom();
			Room nextRoom = currentRoom.getExit("right");
			if(nextRoom != null)
				player.setCurrentRoom(nextRoom);
			else 
				System.out.println("You are still in the same room.");

		}
			
	}

	private static void printRoom(Player player) {
		System.out.println("Welcome to " + player.currentRoom.getName() + "\n");
		System.out.println(player.currentRoom.getShortDescription() + "\n");
		System.out.println(player.currentRoom.getLongDescription()+ "\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Where would you like to go next? Left, Right or leave?");



		
	}

}


