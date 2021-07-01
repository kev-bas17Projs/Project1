package fixtures;

public class Room extends Fixture {
	String name;
	private Room[] exits;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
	
	//public Room(String name) {
		//this.name = name;
	//}
	
	public Room[] getExits() {
		return exits;
	}

	public Room getExit(String direction) {
		switch(direction) {
		case "south":
			return exits[0];
		case "north":
			return exits[1];
		case "west":
			return exits[2];
		case "east":
			return exits[3];
		default:
			return null;
		}
	}
	
	public void setExits(Room south, Room north, Room east, Room west) {
		this.exits[0] = south;
		this.exits[1] = north;
		this.exits[2] = east;
		this.exits[3] = west;
	}
}
