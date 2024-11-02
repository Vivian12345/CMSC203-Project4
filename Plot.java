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

//	public boolean overlaps(Plot plot) {
//		int h_position = horizontalPosition(plot);
//		int v_position = verticalPosition(plot);
//		boolean h_overlap = false;
//		boolean v_overlap = false;
//		switch(h_position) {
//			case 0:
//				if (plot.getX2()> this.getX()) {
//					h_overlap = true;
//					break;
//				}	
//			case 1:
//			{
//				h_overlap = true;
//				break;
//			}
//				
//			case 2:
//				h_overlap = false;
//				break;
//			
//		}
//		
//		switch(v_position) {
//			case 0:
//				v_overlap = false;
//				break;
//			case 1:
//				v_overlap = true;
//				break;
//			case 2:
//				v_overlap = false;
//				break;
//		}
//		
//		if (v_overlap && h_overlap)
//			return true;
//		else
//			return false;
//	}
//	
//	public int horizontalPosition(Plot plot) {
//		int position;
//		//0 for left, 1 for mid, 2 for right
//		if (plot.getX() < this.getX())
//			position = 0;
//		else if (plot.getX()>= this.getX2())
//			position = 2;
//		else
//			position = 1;
//		return position;
//	}
//	
//	public int verticalPosition(Plot plot) {
//		int position;
//		//0 for top, 1 for mid, 2 for bot
//		if (plot.getY2() <= this.getY())
//			position = 0;
//		else if (plot.getY() >= this.getY())
//			position = 2;
//		else
//			position = 1;
//		return position;
//	}
	
	
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
