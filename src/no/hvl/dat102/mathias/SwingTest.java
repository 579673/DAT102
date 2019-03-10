package no.hvl.dat102.mathias;

import java.util.Arrays;

import javax.swing.*;

public class SwingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		int[] list = new int[1000000];
		
		for (int i = 0; i < 1000000; i++) {
			list[i] = (int)(Math.random()*1000);
			System.out.println(list[i]);
		}
		
		System.out.println(System.currentTimeMillis()-time);
		Arrays.sort(list);
		System.out.println(System.currentTimeMillis()-time);
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println(list[i]);
		}
	}

}
