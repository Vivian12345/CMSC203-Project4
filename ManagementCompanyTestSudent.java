import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestSudent {
	Property myProperty;
	ManagementCompany mgmCompany ; 
	
	@Before
	public void setUp() throws Exception {
		mgmCompany= new ManagementCompany("MyCompany", "2222222",5);
	}

	@After
	public void tearDown() throws Exception {
		mgmCompany=null;
	}

	@Test
	public void testAddProperty() {
		myProperty = new Property ("Rio", "Rockville", 2221, "Vivian Cheng",1,7,5,2);		 
		assertEquals(mgmCompany.addProperty(myProperty),0,0);	//property has been successfully added to index 0
	}
	
	@Test
	public void testGetPropertiesCount() {
		myProperty = new Property ("Rio", "Rockville", 2221, "Vivian Cheng",1,7,5,2);	 
		assertEquals(mgmCompany.addProperty(myProperty),0,0);	
		assertEquals(mgmCompany.getPropertiesCount(), 1);
	}

	@Test
	public void testToString() {
		myProperty = new Property ("Rio", "Rockville", 2221.0, "Vivian Cheng",1,7,5,2);
		assertEquals(mgmCompany.addProperty(myProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for MyCompany, taxID: 2222222\n"
				+ "______________________________________________________\n"
				+ "Rio,Rockville,Vivian Cheng,2221.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ " total management Fee: 111.05";
		System.out.println(expectedString);
		System.out.println(mgmCompany.toString());
		assertEquals(expectedString, mgmCompany.toString());
				
	}

}
