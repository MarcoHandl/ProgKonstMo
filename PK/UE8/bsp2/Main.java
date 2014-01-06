package bsp2;

import bsp1.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainSequenceStar mss1 = new MainSequenceStar(0.5);
		MainSequenceStar mss2 = new MainSequenceStar(1.1);
		MainSequenceStar mss3 = new MainSequenceStar(1.5);
		MainSequenceStar mss4 = new MainSequenceStar(5.1);
		MainSequenceStar mss5 = new MainSequenceStar(7.0);
		Galaxy galaxy = new Galaxy();
		
		
		System.out.println(galaxy);
		galaxy.add(mss4);
		galaxy.advanceTime();
		
		
		System.out.println(galaxy);
		galaxy.add(mss3);
		galaxy.advanceTime();
		
		
		System.out.println(galaxy);
		galaxy.add(mss2);
		galaxy.advanceTime();
		
		
		System.out.println(galaxy);
		galaxy.add(mss1);
		galaxy.add(mss5);
		galaxy.advanceTime();
		
		
		System.out.println(galaxy);
		galaxy.advanceTime();
		System.out.println(galaxy);
		galaxy.advanceTime();
		System.out.println(galaxy);
		galaxy.advanceTime();
		System.out.println(galaxy);
		galaxy.advanceTime();
		System.out.println(galaxy);

	}

}
