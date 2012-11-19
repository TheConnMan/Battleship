import java.util.*; 

public class Ship {
	
	public int length;
	public String startingPosition;
	public ArrayList<String> positions;
	public int unharmedSpaces;
	
	/**
	 * 
	 * @param firstPosition - the starting position of the ship
	 * @param secondPosition - the second position of the ship, to get the direction
	 * @param l - the length of the ship
	 * @author ansela
	 */
	public Ship(String firstPosition, String secondPosition, int l) {
		length = l;
		startingPosition = firstPosition; // not sure if this is necessary (because we have the positions ArrayList)
		unharmedSpaces = l;
		// implement the decomposeMove method to get the move
		// determine how to get the direction of the ship and input all of the
		// positions into the ArrayList
	}
	/**
	 * 
	 * @return true if the ship sunk, false if not sunk.
	 * @author ansela
	 */
	public Boolean isSunk() {
		if (unharmedSpaces > 0) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * 
	 * @param position - the square that is being attacked (ex: A1 or H9)
	 * @return true if the space was part of this ship, false if not.
	 * @author ansela
	 */
	public Boolean attackSpace(String position) {
		if (positions.contains(position)) { // we're hit!
			unharmedSpaces--;
			return true;
		}
		return false;
	}
}
