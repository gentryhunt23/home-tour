package game;
import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms = new Room[5];
	
	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small entryway",
			"The small entryway upon entering the home. There are not many places to go inside my small home but you are more than welcomed to take a peek around." + "\n"
			+ "The stairs to the carpeted path to the left will take you to the bedroom where the bathroom is also located." + "\n"
			+ "To the right is a small hallway that leads to the kitchen and through the kitchen is the living room, where you can watch TV.");
			this.rooms[0] = foyer;
	        this.startingRoom = foyer;
	        
	    Room kitchen = new Room(
			"The kitchen",
			"Where my mom normally is",
			"The 60's themed kitchen contains a vintage style refrigerator with some tasty delectables." + "\n"
			+ "Through the kitchen to the right is the living room where the TV is set up for all sporting events." + "\n"
			+ "No reality TV allowed.");
			this.rooms[1] = kitchen;
    	        
        Room bathroom = new Room(
			"The bathroom",
			"Where narcissism may take place",
			"The full bathroom contains a porcelain 'john' and beautiful vanity." + "\n"
			+ "There is a limestone tiled shower with a waterfall shower fixture andbuilt in steam room." + "\n"
			+ "There is a window that can be opened and when you are all finished you can exit back into the bedroom to the right.");
			this.rooms[2] = bathroom;
	        
        Room bedroom = new Room(
			"The bedroom",
			"Where dreams are made...literally",
			"The faily large bedroom is accompanied by a queem size sleep number. Take a nap and rejuvenate if need be." + "\n"
			+ "There is a book case on the far wall for the worms if bordeom strikes and a record player to set the mood... for sleeping." + "\n"
			+ "Exit through the bedroom to the left to enter the bathroom for freshening up before a night on the town.");
			this.rooms[3] = bedroom;
        Room livingRoom = new Room(
			"The living Room",
			"A room for sports and ONLY sports. Because without sports.. is life worth living?! #TeamLeBron",
			"The large entertainment area with a 70 inch Samsung 8K television and 1400 Watt Bose Sound Environment." + "\n"
			+ "Turn the TV on if you don't have anything to do all week and/or enjoy an ice cold beverage from the mini cooler located in the near corner." + "\n"
			+ "I keep the drinks close to calm my nerves when watching the Bulls. Exit this oasis back through the kitchen to the left.");
			this.rooms[4] = livingRoom;
			
		//TO-DO Set all the respective exits
			foyer.setExits(bedroom,kitchen);
			kitchen.setExits(foyer,livingRoom);
			bedroom.setExits(bathroom,foyer);
			livingRoom.setExits(kitchen,null);
			bathroom.setExits(null,bedroom);


}
		
}
