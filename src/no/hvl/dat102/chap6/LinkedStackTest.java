package no.hvl.dat102.chap6;

public class LinkedStackTest {

	public static void main(String[] args) {
		
		LinkedQueue<Integer> s = new LinkedQueue<>();
		for (int i = 0; i < 10; i++) {
			s.push(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(s.pop());
		}
	}

}
