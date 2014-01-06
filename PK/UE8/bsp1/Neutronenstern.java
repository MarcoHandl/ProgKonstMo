package bsp1;

public class Neutronenstern implements Star {

	private double mass;
	
	public Neutronenstern(double mass) {
		super();
		this.mass = mass;
	}
	
	@Override
	public Star advanceTime() throws OutOfTime {
		throw new OutOfTime();
	}

	@Override
	public int getSurfaceTemperature() {
		return 250000;
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
		return (int)(mass * 0.8);
	}

	@Override
	public int getIntrinsicBrightness() {
		return (int)(mass * 0.3);
	}

	@Override
	public String toString() {
		return "Neutronenstern [mass=" + mass + "]";
	}
}
