package ue2;

public class Bsp1Main {
	
	
	public static void main(String [] args) throws Exception{
		
		Ladybird daisy = new Ladybird("daisy", 2, 6, true);
		Ladybird garfild = new VerfressusLadyBirdus("garfild", 2, 12, true);
		Ladybird lalinea = new ZweiDusLadyBirdus("lalinea", 2, 3);
		Ladybird flash = new VoiGasusLadyBirdus("flash", 2, 17);
		
		IFood gras = new Gras();
		IFood meet = new Meet();
		

		
		System.out.println("\n============= daisy =================");

		for(int i=1; i<15; i++){
			
			daisy.doTheLocomotion();
			System.out.println(daisy.toString());
			
			if(i % 3 == 0)
				daisy.eat(gras);
			if(i % 5 == 0)
				daisy.eat(meet);
			
			Thread.sleep(500);	
		}
		
		daisy.stopTheLocomotion();
		System.out.println(daisy.toString());
		
		System.out.println("\n============= garfild =================");
		
		for(int i=1; i<15; i++){
			
			garfild.doTheLocomotion();
			System.out.println(garfild.toString());
			
			if(i % 3 == 0)
				garfild.eat(gras);
			if(i % 5 == 0)
				garfild.eat(meet);
			
			Thread.sleep(500);	
		}
		
		garfild.stopTheLocomotion();
		System.out.println(garfild.toString());
		
		System.out.println("\n============= lalinea =================");
		
		for(int i=1; i<15; i++){
			
			lalinea.doTheLocomotion();
			System.out.println(lalinea.toString());
			
			if(i % 3 == 0)
				lalinea.eat(gras);
			if(i % 5 == 0)
				lalinea.eat(meet);
			
			Thread.sleep(500);	
		}
		
		lalinea.stopTheLocomotion();
		System.out.println(lalinea.toString());
		
		System.out.println("\n============= flash =================");
		
		for(int i=1; i<15; i++){
			
			flash.doTheLocomotion();
			System.out.println(flash.toString());
			
			if(i % 3 == 0)
				flash.eat(gras);
			if(i % 5 == 0)
				flash.eat(meet);
			
			Thread.sleep(500);	
		}	
		
		
		flash.stopTheLocomotion();
		System.out.println(flash.toString());
		
		
		System.out.println("\n============= distanzes =================");
		
		//test distanz
		
		System.out.println("\ndistanz daisy and garfild:");
		System.out.println(daisy.dist(garfild));
		
		System.out.println("\ndistanz daisy and lalinea:");
		System.out.println(daisy.dist(lalinea));
		
		System.out.println("\ndistanz daisy and flash:");
		System.out.println(daisy.dist(flash));
		
		
		System.out.println("\ndistanz garfild and lalinea:");
		System.out.println(garfild.dist(lalinea));
		
		System.out.println("\ndistanz garfild and flash:");
		System.out.println(garfild.dist(flash));
		
		System.out.println("\ndistanz lalinea and flash:");
		System.out.println(lalinea.dist(flash));
		
	}
	
}
