package no.hvl.dat102.appendixA.b6;

public class Task implements Priority {
	private int priority;
	private String task;
	
	public Task(int priority, String task) {
		this.priority = priority;
		this.task = task;
	}

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public int getPriority() {
		return priority;
	}
	@Override
	public String toString() {
		return task + "\n" + "Priority: " + priority;
	}
	
}
