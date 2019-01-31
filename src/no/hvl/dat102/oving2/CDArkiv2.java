package no.hvl.dat102.oving2;

import no.hvl.dat102.kap3.stack.EmptyCollectionException;
import no.hvl.dat102.oving1.CD;
import no.hvl.dat102.oving1.Genre;
import no.hvl.dat102.oving1.ADT.CDArkivADT;

public class CDArkiv2 implements CDArkivADT {
	private LinearNode<CD> cds;
	private int count;
	public CDArkiv2() {
		this.cds = null;
		this.count = 0;
	}
	public CDArkiv2(CD[] input) {
		add(input);
		this.count = 0;
	}
	
	@Override
	public CD[] getTable() {
		CD[] tab = new CD[count];
		LinearNode<CD> temp = cds;
		if (temp == null)
			return new CD[0];
		for (int i = 0; i < count; i++) {
			tab[i] = temp.getElement();
			temp = temp.getNext();
		}
		return tab;
	}

	@Override
	public void add(CD cd) {
		LinearNode<CD> temp = cds;
		if (count == 0) {
			cds = new LinearNode<CD>(cd);
			count++;
			return;
		}
		while (temp.getNext() != null)
			temp = temp.getNext();
		temp.setNext(new LinearNode<CD>(cd));
		//this.cds = new LinearNode<CD>(cd, cds);
		this.count++;
	}
	public void add(CD[] cds) {
		for (CD cd : cds)
			add(cd);
	}

	@Override
	public boolean del(CD cd) {
		if (count == 0)
			throw new EmptyCollectionException("CDArkiv");
		
		LinearNode<CD> current = cds, previous = null;
		boolean deleted = false;
		do {
			if (current.getElement().equals(cd)) {
				if (previous != null)
					previous.setNext(current.getNext());
				else 
					current = null;
				count--;
				deleted = true;
			}
		} while (current.hasNext());
		return deleted;
	}

	@Override
	public CD[] searchTitle(String substr) {
		LinearNode<CD> temp = cds;
		CDArkiv2 result = new CDArkiv2();
		if (temp == null)
			return new CD[0];
		do {
			if (temp.getElement().getTitle().toUpperCase().contains(substr.toUpperCase()))
				result.add(temp.getElement());
			temp = temp.getNext();
		} while (temp != null);
		return result.getTable();
	}

	@Override
	public CD[] searchArtist(String substr) {
		LinearNode<CD> temp = cds;
		CDArkiv2 result = new CDArkiv2();
		if (temp == null)
			return new CD[0];
		while (temp != null) {
			if (temp.getElement().getArtist().toUpperCase().contains(substr.toUpperCase()))
				result.add(temp.getElement());
			temp = temp.getNext();
		}
		return result.getTable();
	}

	@Override
	public CD[] searchGenre(Genre g) {
		LinearNode<CD> temp = cds;
		CDArkiv2 result = new CDArkiv2();
		while (temp != null) {
			if (temp.getElement().getGenre().equals(g))
				result.add(temp.getElement());
			temp = temp.getNext();
		}
		if (result.sizeOf() == 0)
			return new CD[0];
		return result.getTable();
	}

	@Override
	public int sizeOf() {
		return count;
	}

}
