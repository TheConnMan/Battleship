import java.util.*; 

public class Ship {
	
	public int length;
	public String startingPosition;
	public ArrayList<String> positions;
	public int unharmedSpaces;
	
	/**
	 * Initializes a ship and gets its
	 * @param firstPosition - the starting position of the ship
	 * @param secondPosition - the second position of the ship, to get the direction
	 * @param l - the length of the ship
	 * @author ansela
	 */
	public Ship(String firstPosition, String secondPosition, int l) {
		length = l;
		startingPosition = firstPosition; // not sure if this is necessary (because we have the positions ArrayList)
		unharmedSpaces = l;
		ArrayList<String> positions = new ArrayList<String>();
		// implement the decomposeMove method to get the move
		// determine how to get the direction of the ship and input all of the
		// positions into the ArrayList
		int[] first = new int[2];
		int[] second = new int[2];
		Rules rule = new Rules();
		first = rule.decomposeMove(firstPosition);
		second = rule.decomposeMove(secondPosition);

		//String firstTest = rule.composeMove(first);
		//String secondTest = rule.composeMove(second);
		
		if (first[0] == second[0]) { // letters are the same, need to iterate through the numbers
			int startingPosition = first[1];
			int direction = second[1] - first[1];
			for(int i = 0; i < length; i++) {
				int[] move = {first[0], (startingPosition+(i*direction))};
				String result = rule.composeMove(move);
				positions.add(result);
			}
		} else if (first[1] == second[1]) { // numbers are the same, need to iterate through the letters
			int startingPosition = first[0];
			int direction = second[0] - first[0];
			for(int i = 0; i < length; i++) {
				int[] move = {(startingPosition+(i*direction)), first[1]};
				String result = rule.composeMove(move);
				positions.add(result);
			}
		}
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
