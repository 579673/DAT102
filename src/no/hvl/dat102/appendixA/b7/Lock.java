package no.hvl.dat102.appendixA.b7;

public class Lock implements Lockable {
	private boolean status;
	private int key;
	
	public Lock(int key) {
		this.key = key;
		status = true;
	}

	@Override
	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public void lock(int key) {
		status = false;
	}

	@Override
	public void unlock(int key) {
		status = true;
	}

	@Override
	public boolean locked() {
		return status;
	}
	
}
