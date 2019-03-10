package no.hvl.dat102.chap6;

import java.util.EmptyStackException;
import java.util.List;

public class LinkedStack<T> {
	
	private List<T> list = new LinkedList<>();
	private int count = 0;
	
	public void push(T e) {
		list.add(e);
		count++;
	}
	public T pop() {
		if (count == 0)
			throw new EmptyStackException();
		count--;
		return list.remove(count);
	}
	public boolean isEmpty() {
		return count == 0;
	}
}
