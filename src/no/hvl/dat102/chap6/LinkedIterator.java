package no.hvl.dat102.chap6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedIterator<T> implements Iterator<T>{
	
	private LinearNode<T> current;
	
	public LinkedIterator(LinearNode<T> node) {
		this.current = node; 
	}
	
	@Override
	public boolean hasNext() {
		return current.getNext() != null;
	}

	@Override
	public T next() {
		if (current.getNext().getElement() == null)
			throw new NoSuchElementException("No more elements");
		
		current = current.getNext();
		return current.getElement();
	}

}
