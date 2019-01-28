package no.hvl.dat102.kap3.stack;

/**
 * An array implementation of a stack in which the 
 * bottom of our stack is fixed at index 0.
 * @author steff
 *
 * @param <T> element
 */

public class ArrayStack<T> implements StackADT<T> {
	private final static int DEFAULT_CAPACITY = 100;
	private int top;
	private T[] stack;
	
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		top = 0;
		stack = (T[]) (new Object[capacity]);
	}
	@Override
	public void push(T element) {
		if (size() == stack.length)
			expandCapacity();
		stack[top] = element;
		top++;
	}
	private void expandCapacity() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[])(new Object[stack.length * 2]);
		for (int i = 0; i < stack.length; i++) {
			temp[i] = stack[i];
		}
		stack = temp;
	}
	@Override
	public T pop() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("stack");
		top--;
		T result = stack[top];
		stack[top] = null;
		return result;
	}

	@Override
	public T peek() throws EmptyCollectionException {
		if (isEmpty()) 
			throw new EmptyCollectionException("stack");
		return stack[top-1];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
