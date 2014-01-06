package ue2;

public class Ladybird implements ILocomotion{
	
	protected String name;
	private int weight ; // Gewicht in Gramm
	private int dots ; // Anzahl der Punkte
	protected int state;
	private boolean canFly;
	protected boolean reverse; //direction of the Bug
	protected double xPos;
	protected double yPos;
	protected double zPos;
	
	public Ladybird(String name, int weight, int dots, boolean canFly) {
		super();
		this.name = name;
		this.weight = weight;
		this.dots = dots;
		this.reverse = false;
		this.state = 0;
		this.canFly = canFly;
		this.xPos = 0.0;
		this.yPos = 0.0;
		this.zPos = 0.0;
	}

	/**
	 * Erhöhe das Gewicht wenn das Essen
	 * essbar ist (bestimmbar über foodName)
	 * um einen Wert der mit nutritionalValue
	 * zusammenhängt.
	 * @param foodName name of the food
	 * @param nutritionalValue kcal
	 */
	public void eat(IFood food) {
	
		if(food.getKcal() > 100){
			System.out.println("Ui das ist zu heavy");
		}else if(food.getKcal() < 10){
			System.out.println("was soll denn das sein Papmasche");
		}else{
			System.out.println("mmmhhh " + food.getName() + " super gut");
			weight++;
		}
	}


	@Override
	public double doTheLocomotion() {
		this.state++;
		if(state > 3)
			state = 1;
		
		if(state == 1){ //slow
			xPos += reverse ? -1 : 1;
			yPos += reverse ? -1.5 : 1.5;
			if(canFly)
				zPos += reverse ? -2.0 : 2.0;
		}else if(state == 2){ //speedy
			xPos += reverse ? -5 : 5;
			yPos += reverse ? -3.5 : 3.5;
			if(canFly)
				zPos += reverse ? -7.0 : 7.0;
		}else{ //change direction
			reverse = !reverse;
		}
		
		return xPos;
	}


	@Override
	public void stopTheLocomotion() {
		this.state = 0;
	}

	double dist(Ladybird p){
		double xdiv = p.xPos - this.xPos;
		double ydiv = p.yPos - this.yPos;
		double zdiv = p.zPos - this.zPos;
		
		return Math.sqrt(xdiv*xdiv + ydiv*ydiv + zdiv*zdiv);
	}
	
	void addWeight(int weight){
		this.weight += weight;
	}
	
	@Override
	public boolean equals(Object that) {
		if(this == that)
			return true;
		if(that == null)
			return false;
		if(this.getClass() != that.getClass())
			return false;
		if(!super.equals(that))
			return false;
		//class specific
		if(((Ladybird)that).name.equals(this.name))
			return false;
		if(((Ladybird)that).dots != this.dots)
			return false;
		if(((Ladybird)that).weight != this.weight)
			return false;
		if(((Ladybird)that).reverse != this.reverse)
			return false;
		if(((Ladybird)that).state != this.state)
			return false;
		if(((Ladybird)that).xPos != this.xPos)
			return false;
		if(((Ladybird)that).yPos != this.yPos)
			return false;
		if(((Ladybird)that).zPos != this.zPos)
			return false;
		if(((Ladybird)that).canFly != this.canFly)
			return false;
		
		return true;
	}


	public int getWeight() {
		return weight;
	}

	public int getDots() {
		return dots;
	}

	@Override
	public String toString() {
		String direction = reverse ? "rückwerts" : "vorwärts";
		String sCanFly   = canFly  ? "ja" : "nein";
		String aufAb = "";
		if(!canFly)
			aufAb = "2D_Bug";
		else
			aufAb = reverse ? "ab" : "auf";
		
		return "Ladybird [name=" + name + ", weight=" + weight + ", dots="
			+ dots + ", state=" + state + ", canFly=" + sCanFly
			+ ", bewegungsrichtung=" + direction + ", " + aufAb + ", xPos=" + xPos
			+ ", yPos=" + yPos + ", zPos=" + zPos + "]";

	}
}
