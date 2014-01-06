package ue2;

public class VerfressusLadyBirdus extends Ladybird {

	
	public VerfressusLadyBirdus(String name, int weight, int dots,
			boolean canFly) {
		super(name, weight, dots, canFly);
	}

	@Override
	public void eat(IFood food) {
		if(food instanceof Meet){
			System.out.println("Yeah, voi geil, Fleisch");
			super.addWeight(2);
		}else if(food instanceof Gras){
			System.out.println("najo Gras");
			super.addWeight(1);
		}else{
			System.out.println("Aha interessant das ist neu");
			super.addWeight(1);
		}
	}

}
