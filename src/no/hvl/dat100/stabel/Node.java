package no.hvl.dat100.stabel;

public class Node <T> {
	private Node next;
	private T node;
	
	public Node(T node) {
		this.node = node;
		this.next = null;
	}
	
	public T getNode() {
		return node;
	}
	public void setNode(T node) {
		this.node = node;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getNext() {
		return next;
	}
}
