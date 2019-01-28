package no.hvl.dat100.oving1;

import no.hvl.dat100.oving1.ADT.CDArkivADT;
/**
 * First implementation of a CD Archive datastructure
 * based on arrays
 * @author Steffen
 */
public class CDArkiv implements CDArkivADT {
	/**
	 * The main table of CDs and a counter varaible.
	 */
	private CD[] tab;
	private int count;
	/**
	 * Default constructor initializes the empty list and count
	 */
	public CDArkiv() {
		this.tab = new CD[10];
		this.count = 0;
	}
	/**
	 * Alternate constructor takes a list of CDs as input
	 * @param input list of CDs
	 */
	public CDArkiv(CD[] input) {
		this.tab = input;
		this.count = 0;
	}
	/**
	 * Add a CD to the archive
	 * @param cd CD object to add
	 * @return true if success, false if fail
	 */
	@Override
	public void add(CD cd) {
		if (count < tab.length) {
			tab[count] = cd;
			count++;
			//return true;
		}else {
			expand();
			add(cd);
			//|return true;
		}
	}
	/**
	 * Delete a CD from the archive
	 * @param cd CD object to be deleted
	 * @return true if success, false if fail
	 */
	@Override
	public boolean del(CD cd) {
		boolean deleted = false;
		for (int i = 0; i < count; i++) {
			if (tab[i].equals(cd)) {
				delete(i);
				deleted = true;
			}
		}
		return deleted;
	}
	/**
	 * Search titles of CDs
	 * @param substr a substring to search for
	 * @return A new table of CDs
	 */
	@Override
	public CD[] searchTitle(String substr) {
		CDArkiv temp = new CDArkiv();
		for (CD cd : trimTab(tab, count)) {
			if (cd.getTitle().toUpperCase().contains(substr.toUpperCase()))
				temp.add(cd);
		}
		return temp.getTable();
	}
	/**
	 * Search for artists by name
	 * @param substr Artist name
	 * @return New archive of CDs
	 */
	@Override
	public CD[] searchArtist(String substr) {
		CDArkiv temp = new CDArkiv();
		for (CD cd : trimTab(tab, count)) {
			if (cd.getArtist().toUpperCase().contains(substr.toUpperCase()))
				temp.add(cd);
		}
		return temp.getTable();
	}
	/**
	 * Search for CDs by genre
	 * @param g genre
	 * @return list of all CDs of that genre
	 */
	public CD[] searchGenre(Genre g) {
		CDArkiv temp = new CDArkiv();
		for (CD cd : trimTab(tab, count)) {
			if (cd.getGenre() == g)
				temp.add(cd);
		}
		return temp.getTable();
	}
	/**
	 * Returns the current amount of CDs
	 * @return amount of CDs
	 */
	@Override
	public int sizeOf() {
		return count;
	}
	/**
	 * Trim the array
	 */
	private CD[] trimTab(CD[] tab, int n) {
		CD[] temp = new CD[n];
		for (int i = 0; i < n; i++) 
			temp[i] = tab[i];
		return temp;
	}
	/**
	 * Get the table of CDs
	 * @return table of CDs
	 */
	@Override
	public CD[] getTable() {
		return trimTab(tab, count);
	}
	/**
	 * Method to expand the table
	 */
	private void expand() {
		CD[] tmp = new CD[(int)Math.ceil(count * 1.1)];
		for (int i = 0; i < count; i++) 
			tmp[i] = tab[i];
		tab = tmp;
	}
	/**
	 * Delete a CD
	 * @param i index
	 */
	private void delete(int i) {
		tab[i] = tab[count-1];
		tab[count-1] = null;
		count--;
	}
	/**
	 * Returns a String representation of the archive
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (CD cd : tab) 
			sb.append(cd + "\n");
		return sb.toString();
	}
}
