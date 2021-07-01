package game;

import fixtures.Room;

public class RoomManager {

	Room[] rooms = new Room[4];
	Room StartingRoom;
	
	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public Room getStartingRoom() {
		return StartingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		StartingRoom = startingRoom;
	}

	public void init() {
		Room foyer = new Room("The Foyer", "a small foyer",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen."
						+ "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."
						+ "\n" + "To the north is a small room, where you can see a piano.");
		this.rooms[0] = foyer;
		this.StartingRoom = foyer;

		Room LivingRoom = new Room("The Living Room", "a medium living room",
				"The room where the guest is first introduced when the guest enters the house." + "\n"
						+ "The living room leads east into the garden." + "\n"
						+ "To the north of the room you can see the furniture surrounded by couches and chairs.");
		this.rooms[1] = LivingRoom;

		Room Hallway = new Room("The Hallway", "A long corridor hallway.",
				"A long corridor north of the living room leading to the backyard and bathroom" + "\n"
						+ "To the west of the hallway is the kitchen." + "\n"
						+ "To the north of the hallway is the bathroom.");
		this.rooms[2] = Hallway;

		Room Kitchen = new Room("The Kitchen", "A medium kitchen with some seats.",
				"A kitchen with a fridge and a stove that is at the south of the living room." + "\n"
						+ "To the north of the kitchen the hallway can be found leading down the corridor." + "\n"
						+ "To the west of the kitchen will be the bathroom down straight.");
		this.rooms[3] = Kitchen;

		// Directions:  south      north  west     east
		foyer.setExits(LivingRoom, null, Hallway, Kitchen);
		LivingRoom.setExits(null, Hallway, Kitchen, null);
		Hallway.setExits(foyer, LivingRoom, null, Kitchen);
		Kitchen.setExits(foyer, LivingRoom, Hallway, null);
		
		// Room Bathroom = new Room("", "", "" + "\n" + "" + "\n" + "");
		// this.rooms[4] = Bathroom;
		
		
	}
}
