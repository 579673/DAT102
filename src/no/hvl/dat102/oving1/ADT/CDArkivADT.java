package no.hvl.dat102.oving1.ADT;

import no.hvl.dat102.oving1.CD;
import no.hvl.dat102.oving1.Genre;

/**
 * Interface to define behavior for a CD Archive ADT
 * @author Steffen
 */
public interface CDArkivADT {
	/**
	 * Returns the table of CDs
	 * @return CD[]
	 */
	public CD[] getTable();
	/**
	 * Add a CD to the archive
	 * @param cd CD object to add
	 * @return true if success, false if fail
	 */
	public void add(CD cd);
	/**
	 * Delete a CD from the archive
	 * @param cd CD object to be deleted
	 * @return true if success, false if fail
	 */
	public boolean del(CD cd);
	/**
	 * Search for CDs by title
	 * @param substr a substring to search for
	 * @return A new archive of CDs
	 */
	public CD[] searchTitle(String substr);
	/**
	 * Search for CDs by artist
	 * @param substr Artist name
	 * @return New archive of CDs
	 */
	public CD[] searchArtist(String substr);
	/**
	 * Search for CDs by genre
	 * @param g genre
	 * @return list of all CDs of that genre
	 */
	public CD[] searchGenre(Genre g);
	/**
	 * Returns the current amount of CDs
	 * @return amount of CDs
	 */
	public int sizeOf();
}
