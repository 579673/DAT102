package no.hvl.dat100.oving1;

import no.hvl.dat100.oving1.ADT.CDArkivADT;

import java.io.*;

public class FileHandler {
	final static String DELIMITER = "#";
	/**
	 * Initializes the archive from a file
	 * @param filename Name of file
	 * @return Filled CD archive
	 * @throws IOException 
	 */
	public static void readFromFile(String filename, CDArkivADT cda) 
													throws IOException {
		BufferedReader br = openBufferedReader(filename);
		String line = br.readLine();
		do {
			cda.add(new CD(line.split("#")));
			line = br.readLine();
		} while (line != null);
	}
	/**
	 * Writes the current archive to a file
	 * @param cda archive to save
	 * @param filename filename
	 */
	public static void writeToFile(CDArkivADT cda, String filename) {
		PrintWriter pw = openFile(filename);
		StringBuilder sb = new StringBuilder();
		if (pw != null) {
			for (CD cd : cda.searchArtist("")) {
				sb.append(cd.getNumber()); sb.append(DELIMITER);
				sb.append(cd.getArtist()); sb.append(DELIMITER);
				sb.append(cd.getTitle());  sb.append(DELIMITER);
				sb.append(cd.getYear());   sb.append(DELIMITER);
				sb.append(cd.getGenre());  sb.append(DELIMITER);
				sb.append(cd.getPublisher());
			}
			pw.println(sb);
		}
		pw.close();
	}
	private static BufferedReader openBufferedReader(String filename) {
		try {
			return new BufferedReader(new FileReader(new File(filename)));	
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
			return null;
		}
	}
	private static PrintWriter openFile(String filename) {
		try {
			return new PrintWriter(new FileWriter(filename, false));
		}
		catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	/**
	 * Checks that a given filename exists
	 * @param filename filename
	 * @return true if exists
	 */
	public static boolean checkFilename(String filename) {
		return new File(filename).exists();
	}
}
