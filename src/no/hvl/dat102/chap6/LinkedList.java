package no.hvl.dat102.chap6;

import java.security.InvalidParameterException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import no.hvl.dat102.kap3.stack.EmptyCollectionException;

public class LinkedList<T> implements List<T>{

	private LinearNode<T> end = new LinearNode<T>();
	private LinearNode<T> start = new LinearNode<T>(null, end);
	private int count;
	
	
	@Override
	public boolean add(T arg0) {
		LinearNode<T> current = start;
		while (current.getNext() != end) {
			current = current.getNext();
		}
		current.setNext(new LinearNode<T>(arg0, end));
		count++;
		return true;
	}

	@Override
	public void add(int arg0, T arg1) {
		if (arg0 >= count) 
			throw new NoSuchElementException("Out of bounds");
		if (arg0 < 0)
			throw new InvalidParameterException("Out of bounds");
		if (count == 0)
			throw new EmptyCollectionException("The list is empty");
		
		LinearNode<T> current = start.getNext();
		
		for (int i = 0; i < arg0; i++) {
			current = current.getNext();
		}
		current.setNext(new LinearNode<T>(arg1, current.getNext()));
		count++;
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		start.setNext(end);
	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int arg0) {
		if (arg0 >= count)
			throw new NoSuchElementException("There aren't that many elements");
		
		if (arg0 < 0) 
			throw new InvalidParameterException("Index can not be less than 0!");
		
		LinearNode<T> current = start.getNext();
		
		for (int i = 0; i < arg0; i++) {
			current = current.getNext();
		}
		return current.getElement();
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public Iterator<T> iterator() {
		return new LinkedIterator<T>(start.getNext());
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int arg0) {
		if (arg0 >= count)
			throw new NoSuchElementException("Out of bounds");
		if (arg0 < 0)
			throw new InvalidParameterException("Out of bounds");
		if (count == 0)
			throw new EmptyCollectionException("The list is empty");
		
		LinearNode<T> current = start;
		
		for (int i = 0; i < arg0; i++) {
			current = current.getNext();
		}
		
		count--;
		LinearNode<T> removed = current.getNext();
		current.setNext(current.getNext().getNext());
		return removed.getElement();
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
