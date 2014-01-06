package bsp3;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MainSequenceStar mss1 = new MainSequenceStar(0.5);
		MainSequenceStar mss2 = new MainSequenceStar(1.1);
		MainSequenceStar mss3 = new MainSequenceStar(1.5);
		MainSequenceStar mss4 = new MainSequenceStar(5.1);
		MainSequenceStar mss5 = new MainSequenceStar(60.0);
		Galaxy galaxy1 = new Galaxy();
		
		
		MainSequenceStar mss10 = new MainSequenceStar(0.5);
		MainSequenceStar mss11 = new MainSequenceStar(0.5);
		MainSequenceStar mss12 = new MainSequenceStar(1.1);
		MainSequenceStar mss13 = new MainSequenceStar(1.5);
		MainSequenceStar mss14 = new MainSequenceStar(20.1);
		MainSequenceStar mss15 = new MainSequenceStar(30.0);
		Galaxy galaxy2 = new Galaxy();
		
		
		galaxy1.add(mss5);
		galaxy1.advanceTime();
		galaxy1.advanceTime();
		galaxy1.advanceTime();
		galaxy1.add(mss1);
		galaxy1.add(mss2);
		galaxy1.add(mss3);
		galaxy1.add(mss4);
		galaxy1.advanceTime();
		
		
		galaxy2.add(mss10);
		galaxy2.add(mss11);
		galaxy2.add(mss12);
		galaxy2.advanceTime();
		galaxy2.add(mss13);
		galaxy2.add(mss14);
		galaxy2.advanceTime();
		galaxy2.add(mss15);
		galaxy2.advanceTime();
		
		System.out.println(galaxy1);
		System.out.println(galaxy2);
		
		galaxy1.collide(galaxy2);
		System.out.println("nach galaxykollision");
		System.out.println(galaxy1);
		System.out.println(galaxy2);
		
		
		//================== Sternkollision ==============================
		
		MainSequenceStar mss20 = new MainSequenceStar(0.5);
		MainSequenceStar mss21 = new MainSequenceStar(0.5);
		try {
			mss20.collide(mss21);
		} catch (PhysicallyImpossible e) {
		}
		System.out.println("\n\nSterkollision:");
		System.out.println(mss20);
		System.out.println(mss21);
		
	}

}
