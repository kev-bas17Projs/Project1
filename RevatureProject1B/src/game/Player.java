package game;

import fixtures.Room;

public class Player {
	Room CurrentRoom;

	public Player(Room CurrentRoom) {
		super();
		this.CurrentRoom = CurrentRoom;
	}

	public Room getCurrentRoom() {
		return CurrentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.CurrentRoom = currentRoom;
	}
}
