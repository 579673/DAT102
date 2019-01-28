package no.hvl.dat102.oving1;
/**
 * Stores different music genres
 * @author Steffen
 *
 */
public enum Genre {
	ROCK, POP, HIPHOP, BLUES, COUNTRY, RAP, ELECTRONIC, METAL;
	/**
	 * Converts a string to an enum
	 * @param String 
	 * @return Genre
	 */
	public static Genre stringToGenre(String s) {
		for (Genre g : Genre.values()) {
			if (g.name().compareToIgnoreCase(s) == 0)
				return g;
		}
		return null;
	}
}
