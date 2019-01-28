package no.hvl.dat100.oving1;

import java.io.IOException;

import no.hvl.dat100.oving1.ADT.CDArkivADT;

public class Menu {
	private CDArkivADT cda;
	private TextGUI gui;
	private String filename;
	private final String[] mainMenu = {"Add new CD", "Delete CD", "Display all CDs", 
										"Search by Title", "Search by Artist", "Search by Genre",
										"Display statistics", "Exit"};
	private final String[] deleteMenu = {"Delete by title", "Delete by artist", "Return to main menu"};
	
	public Menu(CDArkivADT cda) {
		this.gui = new TextGUI();
		this.cda = cda;
	}
	//Initialize the archive
	public void start() {
		try {
			filename = gui.promptForFilename();
		if (FileHandler.checkFilename(filename)) 
			FileHandler.readFromFile(filename, cda);
		}
		catch (IOException ioe) {
			System.out.println(ioe);
		}
		run();
	}
	//The main program loop
	//TODO: Better stats
	private void run() {
		int todo = gui.displayMenu(mainMenu);
		switch (todo) {
			case 1: cda.add(gui.readCD());
				break;
			case 2: this.deleteCD();
				break;
			case 3: gui.printAllTitle(cda, "");
				break;
			case 4: gui.printAllTitle(cda, gui.getSearchWord());
				break;
			case 5: gui.printAllArtist(cda, gui.getSearchWord());
				break;
			case 6:	gui.printAllGenre(cda, gui.getSearchWord());
				break;
			case 7: gui.printStats(cda);
				break;
			case 8: stop();
				break;
			default:
		}
		run();
	}
	//Shutdown procedure
	private void stop() {
		save();
		System.exit(0);
	}
	private void save() {
		if (gui.confirmDialog(cda.getTable(), "Do you wish to save this archive?"))
			FileHandler.writeToFile(cda, filename);
	}
	private void deleteByTitle() {
		CD[] results = cda.searchTitle(gui.getSearchWord());
		if (gui.confirmDialog(results, "Are you sure you wish to delete these CDs?"))
			deleteAll(results);
		else
			deleteByTitle();	
	}
	private void deleteByArtist() {
		CD[] results = cda.searchArtist(gui.getSearchWord());
		if (gui.confirmDialog(results, "Are you sure you wish to delete these CDs?"))
			deleteAll(results);
		else
			deleteByArtist();
	}
	private void deleteAll(CD[] cds) {
		for (CD cd : cds)
			cda.del(cd);
	}
	private void deleteCD() {
		int todo = gui.displayMenu(deleteMenu);
		switch (todo) {
		case 1: deleteByTitle();
			break;
		case 2: deleteByArtist();
			break;
		case 3: break;
		default:
			System.out.println(todo + " is not a valid option");
			deleteCD();
		}
	}
}
