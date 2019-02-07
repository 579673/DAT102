package no.hvl.dat102.kap3.stack;

public class DropOutStack<T> implements StackADT<T> {
	private final static int DEFAULT_CAPACITY = 100;
	private int capacity;
	private int top = 0;
	private int bottom = 0;
	private T[] stack;
	
	public DropOutStack() {
		this.stack = (T[])(new Object[DEFAULT_CAPACITY]);
		this.capacity = DEFAULT_CAPACITY;
	}
	public DropOutStack(int capacity) {
		this.stack = (T[])(new Object[capacity]);
		this.capacity = capacity;
	}
	
	@Override
	public void push(T element) {
		this.stack[top % (capacity)] = element;
		this.top++;
		if (top > capacity)
			this.bottom++;
		if (bottom > capacity) {
			bottom = 0; 
			top = top - (capacity);
		}
	}

	@Override
	public T pop() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("DropOutStack");
		this.top--;
		return stack[top % (capacity)];
	}

	@Override
	public T peek() throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException("DropOutStack");
		return stack[top];
	}

	@Override
	public boolean isEmpty() {
		return top <= bottom;
	}

	@Override
	public int size() {
		return top;
	}

}
