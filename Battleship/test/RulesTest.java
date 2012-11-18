import static org.junit.Assert.*;

import org.junit.Test;


public class RulesTest {

	@Test
	public void testMultiply() {
		Rules tester=new Rules();
		assertEquals(10, tester.multiply(2, 5));
		assertEquals(4, tester.multiply(2, 2));
	}

}
