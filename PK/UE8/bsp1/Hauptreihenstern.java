package bsp1;

public class Hauptreihenstern implements Star {

	private double mass;
	
	public Hauptreihenstern(double mass) {
		super();
		this.mass = mass;
	}
	
	@Override
	public Star advanceTime() throws OutOfTime {
		return (mass < 0.6) ? new WeisserZwerg(mass) : new RoterRiesenstern(mass); 
	}

	@Override
	public int getSurfaceTemperature() {
		return 1000000;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		//fallbeschleunigung 
		return (int)(mass*5);
	}

	@Override
	public double getMass() {
		return this.mass;
	}

	@Override
	public int getSize() {
		return (int)(mass * 1.5);
	}

	@Override
	public int getIntrinsicBrightness() {
		return (int)(mass * 1);
	}

	@Override
	public String toString() {
		return "Hauptreihenstern [mass=" + mass + "]";
	}

}
