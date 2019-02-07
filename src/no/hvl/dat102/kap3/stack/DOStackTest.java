package no.hvl.dat102.kap3.stack;

public class DOStackTest {
	public static void main(String[] args) {
		DropOutStack<Integer> stack = new DropOutStack(5);
		for (int i = 0; i < 7; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 7; i++) {
			System.out.println(stack.pop());
		}
	}
}
