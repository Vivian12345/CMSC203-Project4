/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: Property Management Company
 * Due: 11/02/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ya-Wen Cheng
*/


import java.io.*;
import java.util.*;

public class ManagementCompany {

	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_DEPTH = 10;
	public static final int MGMT_WIDTH = 10;
	private ArrayList<Property> properties;
	private Plot plot;
	private String name;
	private String taxID;
	private double mgmFee;

	public ManagementCompany() {
		name = "";
		taxID = "";
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new ArrayList<>();
	}

	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new ArrayList<>();
	}

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(x, y, width, depth);
		properties = new ArrayList<>();
	}

	public ManagementCompany(ManagementCompany otherCompany) {
		new ManagementCompany(otherCompany.getName(), otherCompany.getTaxID(), otherCompany.getMgmFeePer());
		
	}

	public int addProperty(String name, String city, double rent, String owner) {
		Property newPro = new Property(name, city, rent, owner);
		if (properties.size() == MAX_PROPERTY)
			return -1;
		else if (newPro == null)
			return -2;
		else if (!plot.encompasses(newPro.getPlot()))
			return -3;
		else if (checkOverlap(newPro, properties))
			return -4;
		else {
			properties.add(newPro);
			return properties.indexOf(newPro);
		}
	}
	
	public boolean checkOverlap(Property prop, ArrayList<Property> properties) {
		for (Property i: properties) {
			if (prop.getPlot().overlaps(i.getPlot())) 
				return true;
			else
				continue;
		}
		return false;
	}
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
		Property newPro = new Property(name, city, rent, owner, x, y, width, depth);
		if (properties.size() == MAX_PROPERTY)
			return -1;
		else if (newPro == null)
			return -2;
		else if (!plot.encompasses(newPro.getPlot()))
			return -3;
		else if (checkOverlap(newPro, properties))
			return -4;
		else {
			properties.add(newPro);
			return properties.indexOf(newPro);
		}
	}

	public int addProperty(Property property) {
//		Property newPro = new Property(property);
		if (properties.size() == MAX_PROPERTY)
			return -1;
		else if (property == null)
			return -2;
		else if (!plot.encompasses(property.getPlot()))
			return -3;
		else if (checkOverlap(property, properties))
			return -4;
		else {
			properties.add(property);
//			System.out.print(newPro.toString());
			return properties.indexOf(property);
		}
	}
	
	

	public Property getHighestRentPropperty() {
		double max_rent = 0;
		int index = 0;
		for (int i=0; i<properties.size(); i++) {
			if (properties.get(i).getRentAmount() > max_rent) {
				max_rent = properties.get(i).getRentAmount();
				index = i;
			}
		}
		return new Property(properties.get(index));
	}
	
	
	public double getMgmFeePer() {
		return mgmFee;
	}

	public String getName() {
		return name;
	}

	public Plot getPlot() {
		return plot;	
	}

	public ArrayList<Property> getProperties() {
		return properties;
	}

	public int getPropertiesCount() {
		return properties.size();
	}

	public String getTaxID() {
		return taxID;
	}

	public double getTotalRent() {
		double sum = 0;
		for (Property i: properties) {
			sum += i.getRentAmount();
		}
		return sum;
	}

	public boolean isMangementFeeValid() {
		if (mgmFee < 0 || mgmFee > 100)
			return false;
		else
			return true;
	}

	public boolean isPropertiesFull() {
		if (properties.size() == MAX_PROPERTY)
			return true;
		else
			return false;
	}

	public void removeLastProperty(){
		properties.remove(properties.size() - 1);
	}
	

	public String toString() {
		String propertyString = "";
		for (Property i: properties) {
			propertyString+=i.toString();
			propertyString+="\n";
		}
		
		return "List of the properties for "+ getName()+", taxID: "+ getTaxID()
		+"\n"+"______________________________________________________\n"
		+propertyString
		+"______________________________________________________\n"
		+"\n"
		+" total management Fee: "
		+getMgmFeePer()*getTotalRent()*0.01;

	}

}
