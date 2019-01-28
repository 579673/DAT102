package no.hvl.dat100.oving1;

import no.hvl.dat100.oving1.ADT.CDArkivADT;

import java.util.Scanner;

public class TextGUI {
	private Scanner in;
	public TextGUI() {
		in = new Scanner(System.in);
	}
	/**
	 * Prompts the user to input a new CD
	 * @return CD object
	 */
	public CD readCD() {
		try {
			CD cd = new CD();
			System.out.println("CD Number: ");
			cd.setNumber(in.nextInt());
			in.nextLine();
			System.out.println("Artist: ");
			cd.setArtist(in.nextLine());
			System.out.println("Title: ");
			cd.setTitle(in.nextLine());
			System.out.println("Year: ");
			cd.setYear(in.nextInt());
			in.nextLine();
			System.out.println("Genre: ");
			cd.setGenre(Genre.stringToGenre(in.nextLine()));
			System.out.println("Publisher: ");
			cd.setPublisher(in.nextLine());
			return cd;
		}
		catch (Exception e) {
			System.out.println(e);
			in.nextLine();
			return readCD();
		}
	}
	/**
	 * Display the details of a CD in the console
	 * @param cd cd to display
	 */
	public void displayCD(CD cd) {
		System.out.println(cd);
	}
	/**
	 * Print all CDs with a particular substr in title
	 * @param substr substring to search for
	 */
	public void printAllTitle(CDArkivADT cda, String title) {
		for(CD cd : cda.searchTitle(title))
			System.out.println(cd);
	}
	/**
	 * Print all CDs from one artist
	 * @param artist artist to search for
	 */
	public void printAllArtist(CDArkivADT cda, String artist) {
		for(CD cd : cda.searchArtist(artist))
			System.out.println(cd);
	}
	/**
	 * Print all CDs of a given genre
	 * @param cda CD Archive
	 * @param input Search term
	 */
	public void printAllGenre(CDArkivADT cda, String input) {
		Genre genre = Genre.stringToGenre(input);
		while (genre == null)
			genre = Genre.stringToGenre(getGenre());
		for (CD cd : cda.getTable())
			if (cd.getGenre() == genre)
				System.out.println(cd);
	}
	/**
	 * Print simple statistcs about archive
	 * @param cda CD Archive
	 */
	public void printStats(CDArkivADT cda) {
		System.out.println("Total number of CDs: " + cda.sizeOf());
		System.out.println("CDs per genre: ");
		System.out.println("--------------------------------------");
		for (Genre g : Genre.values()) {
			System.out.println(stringSize(g.name(), 10) + " : " + cda.searchGenre(g).length);
		}
		System.out.println();
	}
	/**
	 * Prompt the user for a filename
	 * @return String filename
	 */
	public String promptForFilename() {
		System.out.println("Please enter a filename to read from or write to: ");
		return in.nextLine();
	}
	/**
	 * Display size of collection
	 * @param cda
	 */
	public void displaySize(CDArkivADT cda) {
		System.out.println("Current number of CDs: " + cda.sizeOf());
	}
	/**
	 * Display any menu defined by a list of Strings
	 * @param options String[] menu items
	 * @return int User's choice
	 */
	public int displayMenu(String[] options) {
		for (int i = 1; i < options.length+1; i++)
			System.out.println(i + " : " + options[i-1]);
			int r = in.nextInt();
			in.nextLine();
		return r;
	}
	/**
	 * Prompt user for search term
	 * @return String search term
	 */
	public String getSearchWord() {
		System.out.println("Please enter a string to search for:");
		return in.nextLine();
	}
	/**
	 * Prompt user for search term
	 * @return String seatch term
	 */
	public String getGenre() {
		System.out.println("Please enter a Genre:");
		return in.nextLine();
	}
	/**
	 * Prompt user to confirm action
	 * @param cds List of CDs to perform action on
	 * @param question Question for the user
	 * @return User's answer, true or false
	 */
	public boolean confirmDialog(CD[] cds, String question) {
		printCDs(cds);
		System.out.println(question + " Y/N");
		switch(in.nextLine().toUpperCase()) {
			case "Y": return true;
			case "N": return false;
		}
		System.out.println("Invalid input");
		return confirmDialog(cds, question);
	}
	private void printCDs(CD[] cds) {
		for (CD cd : cds)
			System.out.println(cd);
	}
	private String stringSize(String s, int size) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size-s.length(); i++)
			sb.append(" ");
		sb.append(s);
		return sb.toString();
	}
	private String getString(String prompt) {
		System.out.println(prompt);
		return in.nextLine();
	}
	private int getInt(String prompt) {
		System.out.println(prompt);
		while (!in.hasNextInt()) {
			System.out.println("That's not a number");
			in.next();
		}
		return in.nextInt();
	}
}
