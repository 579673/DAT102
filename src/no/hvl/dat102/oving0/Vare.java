package no.hvl.dat102.oving0;
import java.util.Scanner;

public class Vare {
	private int varenummer;
	private String navn;
	private double pris;
	
	public Vare() {
		this(0, "", -1);
	}
	public Vare(int varenummer) {
		this(varenummer, "", -1);
	}
	public Vare(int varenummer, String navn, double pris) {
		this.varenummer = varenummer;
		this.navn = navn;
		this.pris = pris;
	}
	public int getVarenummer() {
		return varenummer;
	}
	public void setVarenummer(int varenummer) {
		this.varenummer = varenummer;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris = pris;
	}
	public void lesVare(int varenummer) {
		Scanner in = new Scanner(System.in);
		System.out.println("Skriv inn navn og pris for vare " + varenummer + ":");
		System.out.println("Navn: ");
		if (in.hasNextLine())
			this.setNavn(in.nextLine());
		System.out.println("Pris: ");
		while(pris < 0)
			if (in.hasNextDouble())
				pris = in.nextDouble();
		in.close();
	}
}
