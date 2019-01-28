package no.hvl.dat102.appendixA.b5;

public class Flight {
	private String airline;
	private int fNumber;
	private String origin;
	private String destination;
	
	public Flight(String airline, int fNumber, String origin, String destination) {
		this.airline = airline;
		this.fNumber = fNumber;
		this.origin = origin;
		this.destination = destination;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getfNumber() {
		return fNumber;
	}

	public void setfNumber(int fNumber) {
		this.fNumber = fNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return airline + " flight number " + fNumber + " from " + origin + " to " + destination;
	}
	
}
