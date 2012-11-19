
public class Rules {

	/**
	 * Test function that multiplies two ints
	 * @param a - First int
	 * @param b - Second int
	 * @return Product of the two ints
	 * @author Brian
	 */
	public int multiply(int a, int b) {
		return a*b;
	}
	
	/**
	 * Decomposes a square name (i.e. A1 or H4) into an array of ints corresponding to the board indices
	 * @param move - Square name
	 * @return Int array, [0]=column index, [1]=row index
	 * @author Brian
	 */
	public int[] decomposeMove(String move) {
		int[] decomposedMove = new int[2];
		String[] letters={"A","B","C","D","E","F","G","H","I","J"};
		for (int num=0; num<letters.length; num++) {
			if (letters[num].equals(move.substring(0, 1))) {
				decomposedMove[0]=num;
				break;
			}
		}
		decomposedMove[1]=Integer.valueOf(move.substring(1))-1;
		return decomposedMove;
	}
	/**
	 * Checks if two squares are in line with each other when placing pieces on the board
	 * @param move1 - First square
	 * @param move2 - Second square
	 * @return Returns true if the moves are in line with each other, false otherwise
	 */
	public boolean inLine(int[] move1, int[] move2) {
		boolean valid=false;
		
		return valid;
	}
	
	/**
	 * Calculates the distance between the moves (including end points)
	 * @param move1 - First square
	 * @param move2 - Second square
	 * @return Distance between moves including end points
	 */
	public int distanceApart(int[] move1, int[] move2) {
		return 1;
	}
	
	/**
	 * Returns the rows and columns of the squares between move1 and move2
	 * @param move1 - First square
	 * @param move2 - Second square
	 * @return Int array, [0][0]=column index of first square, [0][1]=row index of first square
	 */
	public int[][] spacesBetween(int[] move1, int[] move2) {
		int[][] spaces={{1}};
		return spaces;
	}
	
	/**
	 * Checks if all spaces between moves are open for placing a piece
	 * @param spacesBetween - Array of rows and columns between moves
	 * @return True if all spaces are open, false otherwise
	 */
	public boolean positionsOpen(int[][] spacesBetween) {
		return false;
	}
}
