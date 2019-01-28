package no.hvl.dat102.appendixA;

public class MultiSphere {
	public static void main(String[] args) {
		Sphere s1 = new Sphere(10);
		Sphere s2 = new Sphere(20);
		Sphere[] sTab = new Sphere[6];
		for (int i = 0; i < sTab.length; i++) {
			sTab[i] = new Sphere(i * 10);
		}
		System.out.println(s1.toString());	
		System.out.println(s2.toString());
		for (Sphere s : sTab) {
			System.out.println(s.toString());
		}
	}
}
