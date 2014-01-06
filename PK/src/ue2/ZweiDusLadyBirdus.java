package ue2;

public class ZweiDusLadyBirdus extends Ladybird {

	public ZweiDusLadyBirdus(String name, int weight, int dots) {
		super(name, weight, dots, false);
	}

	@Override
	double dist(Ladybird p) {
		double xdiv = p.xPos - this.xPos;
		double ydiv = p.yPos - this.yPos;
		double zdiv = p.zPos - 0;
		
		return Math.sqrt(xdiv*xdiv + ydiv*ydiv + zdiv*zdiv);
	}
	
	@Override
	public double doTheLocomotion() {
		this.state++;
		if(state > 3)
			state = 1;
		
		if(state == 1){ //slow
			xPos += reverse ? -1 : 1;
			yPos += reverse ? -1.5 : 1.5;

		}else if(state == 2){ //speedy
			xPos += reverse ? -5 : 5;
			yPos += reverse ? -3.5 : 3.5;

		}else{ //change direction
			reverse = !reverse;
		}
		
		return xPos;
	}
	
	
	@Override
	public String toString() {
		String direction = reverse ? "rückwerts" : "vorwärts";

		return "Ladybird [name=" + name + ", weight=" + super.getWeight() + ", dots="
			+ super.getDots() + ", state=" + state + ", canFly=" + "nein"
			+ ", bewegungsrichtung=" + direction + ", xPos=" + xPos
			+ ", yPos=" + yPos + "]";
	}
}
