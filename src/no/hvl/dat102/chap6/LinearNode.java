package no.hvl.dat102.chap6;

public class LinearNode<T> {
	
	private T element;
	private LinearNode<T> next;
	
	public LinearNode() {
		this(null, null);
	}
	
	public LinearNode(T element) {
		this(element, null);
	}
	
	public LinearNode(T element, LinearNode<T> next) {
		this.element = element;
		this.next = next;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public LinearNode<T> getNext() {
		return next;
	}

	public void setNext(LinearNode<T> next) {
		this.next = next;
	}
	
	
}
