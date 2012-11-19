import static org.junit.Assert.*;

import org.junit.Test;


public class RulesTest {

	@Test
	public void testMultiply() {
		Rules tester=new Rules();
		assertEquals(10, tester.multiply(2, 5));
		assertEquals(4, tester.multiply(2, 2));
		assertEquals(22, tester.multiply(2, 11));
	}

	@Test
	public void testDecomposeMove() {
		Rules tester=new Rules();
		int[] test1={1,1};
		int[] test2={2,2};
		assertArrayEquals(test1, tester.decomposeMove("B2"));
		assertArrayEquals(test2, tester.decomposeMove("C3"));
	}
	
	@Test
	public void testInLine() {
		Rules tester=new Rules();
		int[] move1={0,0};
		int[] move2={1,1};
		int[] move3={0,4};
		assertTrue(!tester.inLine(move1, move2));
		assertTrue(tester.inLine(move1, move3));
	}
	
	@Test
	public void testPositionsOpen() {
		Rules tester=new Rules();
		int[][] board={{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		assertTrue(false);
	}
}
