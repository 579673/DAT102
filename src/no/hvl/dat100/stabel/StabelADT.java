package no.hvl.dat100.stabel;

public interface StabelADT <T>{
	/**
	 * Push element onto stack
	 * @param element
	 */
	public void push(T element);
	/**
	 * Pop element off stack
	 * @return
	 */
	public T pop();
	/**
	 * Get top element without popping
	 * @return element
	 */
	public T peek();
	
}
