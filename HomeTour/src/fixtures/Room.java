package fixtures;

public class Room extends fixtures.Fixture {
	Room[] exits; 
	
	public Room(String name, String shortDescription, String longDescription) {
		super();
		this.exits = new Room[2]; // size is your choice
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		//[0] = left
		//[1] = right
	}
	
	public String getName() {
		return name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	
	public void setExits(Room exitLeft, Room exitRight) {
		exits[0] = exitLeft;
		exits[1] = exitRight;
	}
		
	public Room[] getExits() {
		return exits;
		
	}
		
	public Room getExit(String direction) {
		if(direction.equals("left")) {
			return exits[0];
		}else if(direction.equals("right")) {
			return exits[1];
		}else return null;
		
	}

}
