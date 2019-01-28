package no.hvl.dat102.appendixA.b6;

public class TaskTestDriver {

	public static void main(String[] args) {
		Task t1 = new Task(1, "Do the dishes");
		System.out.println(t1.toString());
		increasePriority(t1);
		System.out.println(t1.toString());
	}
	public static void increasePriority(Priority p) {
		p.setPriority(p.getPriority()+1);
	}
	public static void decreasePriority(Priority p) {
		if (p.getPriority() > 0)
			p.setPriority(p.getPriority()-1);
	}
}
