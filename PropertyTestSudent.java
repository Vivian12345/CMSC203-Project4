
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This class represents GFA test cases for a Property object.
 *
 * @author Farnaz Eivazi
 * @version 7/11/2022
 */
class PropertyTestSudent {
	Property myProperty;

	@BeforeEach
	void setUp() throws Exception {
		myProperty = new Property("Rio", "Rockville", 12230.00, "Citi Bank");
	}

	@AfterEach
	void tearDown() throws Exception {
		myProperty = null;
	}

	@Test
	void testGetPropertyName() {
		assertEquals("Rio", myProperty.getPropertyName());
	}

	@Test
	void testGetRentAmount() {
		assertEquals(12230.00, myProperty.getRentAmount());
	}

	@Test
	void testGetPlot() {
		assertEquals(0, myProperty.getPlot().getX());
		assertEquals(0, myProperty.getPlot().getY());
		assertEquals(1, myProperty.getPlot().getWidth());
		assertEquals(1, myProperty.getPlot().getDepth());
	}

	@Test
	void testToString() {
		assertEquals("Rio,Rockville,Citi Bank,12230.0",myProperty.toString());	
	}

}
