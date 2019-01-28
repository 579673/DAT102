package no.hvl.dat102.appendixA;

public class Sphere {
	protected double diameter;
	
	public Sphere(double diameter) {
		this.diameter = diameter;
	}
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double volume() {
		return (4/3) * Math.PI * (diameter / 2) * (diameter / 2) * (diameter / 2); //4/3*pi*r^3
	}
	public double surfaceArea() {
		return 4 * Math.PI * ((diameter / 2) * (diameter / 2)); //4*pi*r^2
	}
	@Override
	public String toString() {
		return String.format("This sphere has a diameter of %.2fm, "
				+ "a volume of %.2fm3, "
				+ "and a surface area of %.2fm2", this.diameter, this.volume(), this.surfaceArea());
	}
}
