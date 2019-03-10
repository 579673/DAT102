package no.hvl.dat102.chap6;

import java.util.Scanner;

public class LongToIntTest {
/*
	public static void main(String[] args) {
		long x = 3000000000L;
		System.out.println(x);
		int y = (int)x;
		System.out.println(y);
	}
	*/
	public static void main(String[] args) {
		String path = "0.5, 4.6, 7.4";
		double x, y;
		Scanner scanner = new Scanner(path);
        scanner.useDelimiter(",\\s*");
        //for(; scanner.hasNextLine();) {
        x = scanner.nextDouble();
        System.out.println(x);
        //scanner.nextLine();
        y = scanner.nextDouble(); // this line will not work due to a MismatchException that I cannot
            // figure why it is occurring.
        scanner.nextLine();
        
        System.out.println(x + " " + y);
		
	}

}
