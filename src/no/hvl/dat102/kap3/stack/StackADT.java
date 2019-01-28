package no.hvl.dat102.kap3.stack;

/**
 * Defines the interface to a stack collection
 * @author Steffen
 * @version 1.0
 * @param <T>
 */

public interface StackADT<T> {
	/**
	 * Pushes a given element onto the stack
	 * @param element element
	 */
	public void push(T element);
	/**
	 * Pops an element off the stack
	 * @return element
	 */
	public T pop() throws EmptyCollectionException;
	/**
	 * Peeks at the next element in the stack
	 * @return element
	 */
	public T peek() throws EmptyCollectionException;
	/**
	 * Returns true if the stack is empty, false if not
	 * @return true if the stack is empty
	 */
	public boolean isEmpty();
	/**
	 * Returns the size of the stack
	 * @return int size of stack
	 */
	public int size();
	/**
	 * Returns a string representation of the stack
	 * @return String rep of stack
	 */
	public String toString();
}
