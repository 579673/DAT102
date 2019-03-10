package no.hvl.dat102.chap6;

import java.util.List;

public class LinkedQueue<T> {

	private List<T> list = new LinkedList<>();
	private int count = 0;
	
	public void push(T e) {
		count++;
		list.add(e);
	}
	
	public T pop() {
		count--;
		return list.remove(0);
	}
	
	public boolean hasNext() {
		return count > 0;
	}
}
