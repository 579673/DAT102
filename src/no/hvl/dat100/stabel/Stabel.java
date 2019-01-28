package no.hvl.dat100.stabel;

public class Stabel <T> implements StabelADT <T> {
	private Node top;
	private int amount;
	
	public Stabel(T[] elements) {
		for (T e : elements)
			this.push(e);
	}
	public Stabel(T element) {
		this.top = new Node<T>(element);
		this.amount = 1;
	}
	public Stabel() {
		this.top = null;
		this.amount = 0;
	}
	@Override
	public void push(T element) {
		Node node = new Node<T>(element);
		node.setNext(top);
		top = node;
		amount++;
	}

	@Override
	public T pop() {
		T result = (T)top.getNode();
		top = top.getNext();
		amount--;
		return result;
	}

	@Override
	public T peek() {
		return (T)top.getNode();
	}
	
}
