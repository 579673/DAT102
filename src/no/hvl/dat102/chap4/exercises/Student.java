package no.hvl.dat102.chap4.exercises;

public class Student {
	private String name;
	private int code;
	private Student next;
	public Student(String name, int code, Student next) {
		this.name = name;
		this.code = code;
		this.next = next;
	}
	public Student(String name, int code) {
		this(name, code, null);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Student getNext() {
		return next;
	}
	public void setNext(Student next) {
		this.next = next;
	}
	
}
