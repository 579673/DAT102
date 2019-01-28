package no.hvl.dat102.oving0;

public class ButikkDriver {

	public static void main(String[] args) {
		Butikk butikk = new Butikk("Narvesen", 100);
		for (int i = 0; i < 3; i++) {
			butikk.leggInnNyVare(i);
		}
		for (int i = 0; i < 3; i++) {
			butikk.grossInnkjøp(i, (int)Math.random()*10);
		}
		System.out.println("Total verdi av alle varer: " + butikk.salgsVerdi());
		butikk.slettVare(0);
		butikk.detaljSalg(1);
		butikk.detaljSalg(2);
		butikk.detaljSalg(0);
		System.out.println("Total verdi av alle varer: " + butikk.salgsVerdi());
	}
}
