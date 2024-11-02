
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlotTestSudent {
	private Plot plot1, plot2;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(2, 2, 3, 4);
		plot2 = new Plot(1, 3, 2, 2);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot2 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot2)); // plot2 is entirely inside plot1
	}
	
	@Test
	public void testToString() {
		assertEquals("1,3,2,2",plot2.toString());	
	}

}
