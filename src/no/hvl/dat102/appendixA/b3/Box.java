package no.hvl.dat102.appendixA.b3;

public class Box {
	private double height;
	private double width;
	private double depth;
	private boolean full;
	
	public Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
		full = false;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}
	
	
}
