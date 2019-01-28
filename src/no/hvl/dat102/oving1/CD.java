package no.hvl.dat102.oving1;

public class CD {
	private int number;
	private String artist = "Tanja";
	private String title;
	private int year;
	private Genre genre;
	private String publisher;
	
	public CD() {
		this(0, "", "", 0, Genre.POP, "");
	}
	public CD(int number, String artist, String title, int year, Genre genre, String publisher) {
		this.number = number;
		this.artist = artist;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.publisher = publisher;
	}
	public CD(String[] line) {
		this(	Integer.parseInt(line[0]),
				line[1],
				line[2],
				Integer.parseInt(line[3]),
				Genre.stringToGenre(line[4]),
				line[5]
			);
	}
	public boolean equals(CD cd) {
		return (this.artist.equals(cd.getArtist())) && (this.title.equals(this.getTitle()));
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("   Number : ");
		s.append(this.number + "\n");
		s.append("   Artist : ");
		s.append(this.artist + "\n");
		s.append("    Title : ");
		s.append(this.title + "\n");
		s.append("     Year : ");
		s.append(this.year + "\n");
		s.append("    Genre : ");
		s.append(this.genre + "\n");
		s.append("Publisher : ");
		s.append(this.publisher + "\n");
		return s.toString();
	}
	
}
