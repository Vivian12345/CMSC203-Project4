/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: Property Plot
 * Due: 11/02/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Ya-Wen Cheng
*/

public class Plot {
	private int x;
	private int y;
	private int width;
	private int depth;
	
	//Constructors
	public Plot() {
		width = 1;
		depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot) {
		new Plot(otherPlot.getX(), otherPlot.getY(), otherPlot.getWidth(), otherPlot.getDepth());
	}
	

	public boolean encompasses(Plot plot) {
		if (plot.getX() >= this.getX() && plot.getY() >= this.getY() && plot.getX2() <= this.getX2() && plot.getY2() <= this.getY2())
			return true;
		else
			return false;
	}
	
	public double getX2() {
		return getX()+getWidth();
	}
	
	public double getY2() {
		return getY()+getDepth();
	}
	
	public int getDepth() {
		return depth;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean overlaps(Plot plot) {
		if (plot.getY2() <= this.getY() || plot.getX2() <= this.getX() || plot.getX() >= this.getX2() || plot.getY() >= this.getY2())
			return false;
		else
			return true;
	}
	
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return x+","+y+","+width+","+depth;
	}
	
	
}
