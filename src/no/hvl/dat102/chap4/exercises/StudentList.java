package no.hvl.dat102.chap4.exercises;

public class StudentList {
	private Student sentinel = new Student("", 0);
	private int count = 0;
	
	
	public void add(Student stud) {
		Student temp = sentinel;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(stud);
		count++;
	}
	public void del(int code) {
		Student temp = sentinel;
		Student prev = null;
		while (temp.getNext() != null) {
			prev = temp;
			temp = temp.getNext();
			if (temp.getCode() == code) {
				prev.setNext(temp.getNext());
				count--;
			}
		}
	}
	public Student get(int code) {
		Student temp = sentinel;
		while (temp.getNext() != null) {
			
		}
	}
}
