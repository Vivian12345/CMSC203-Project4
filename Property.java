/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: Property Class
 * Due: 11/02/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ya-Wen Cheng
*/

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	public Property() {
		propertyName = "";
		city = "";
		owner = "";
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}
	
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}

	public Property(Property otherProperty) {
		propertyName = otherProperty.getPropertyName();
		city = otherProperty.getCity();
		rentAmount = otherProperty.getRentAmount();
		owner = otherProperty.getOwner();
		plot = new Plot(otherProperty.getPlot());
	}
	
	public String getCity() {
		return city;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public Plot getPlot() {
		return plot;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}

	public String toString() {
		return propertyName+","+city+","+owner+","+rentAmount;
	}

}
