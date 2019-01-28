package no.hvl.dat102.oving0;

public class Butikk {
	private	Vare[] varer;
	private int[] antall;
	private String navn;
	private int antallTyper;
	
	public Butikk(String navn, int maxVarer) {
		this.navn = navn;
		this.varer = new Vare[maxVarer];
		this.antall = new int[maxVarer];
		this.antallTyper = 0;
	}
	public int finnVare(int varenummer) {
		for (int i = 0; i < varer.length; i++) 
			if ((varer[i] != null) && (varer[i].getVarenummer() == varenummer)) 
				return i;
		return -1;
	}
	public boolean erLedigPlass() {
		return !(antallTyper == varer.length);
	}
	public void leggInnNyVare(int varenummer) {
		if (finnVare(varenummer) > -1) {
			System.out.println("Varen finnes fra før.");
		}
		else {
			varer[antallTyper] = new Vare(varenummer);
			varer[antallTyper].lesVare(antallTyper);
			antallTyper++;
		}
	}
	public void slettVare(int varenummer) {
		if (finnVare(varenummer) > -1) {
			varer[finnVare(varenummer)] = varer[antallTyper-1];
			varer[antallTyper-1] = null;
			antallTyper--;
		}
		else {
			System.out.println("Varen finnes ikke.");
		}
	}
	public void detaljSalg(int varenummer) {
		if ((finnVare(varenummer) > -1) && (antall[finnVare(varenummer)] > 0))
			antall[finnVare(varenummer)]--;
		else
			System.out.println("Varen fins ikke eller er utsolgt.");
	}
	public void grossInnkjøp(int varenummer, int tall) {
		if (finnVare(varenummer) > -1)
			if (tall > 0)
				antall[finnVare(varenummer)] += tall;
			else
				System.out.println("Tallet må være positivt.");
		else
			System.out.println("Varen finnes ikke.");
	}
	public double salgsVerdi() {
		double sum = 0;
		for (int i = 0; i < varer.length; i++) 
			if (varer[i] != null)
				sum += (varer[i].getPris() * antall[i]);
		return sum;
	}
}
