package ue2;

public class VoiGasusLadyBirdus extends Ladybird {

	public VoiGasusLadyBirdus(String name, int weight, int dots) {
		super(name, weight, dots, true);
	}

	@Override
	public double doTheLocomotion() {
		this.state++;
		if(state > 3)
			state = 1;
		
		if(state == 1){ //slow
			xPos += reverse ? -3 : 3;
			yPos += reverse ? -4.5 : 4.5;
			zPos += reverse ? -6.0 : 6.0;
		}else if(state == 2){ //speedy
			xPos += reverse ? -8 : 8;
			yPos += reverse ? -11.5 : 11.5;
			zPos += reverse ? -13.0 : 13.0;
		}else{ //change direction
			reverse = !reverse;
		}
		
		return xPos;
	}

}
