package bsp1;

public class WeisserZwerg implements Star {

	private double mass;
	
	public WeisserZwerg(double mass) {
		super();
		this.mass = mass;
	}
	
	@Override
	public Star advanceTime() throws OutOfTime {
		throw new OutOfTime();
	}

	@Override
	public int getSurfaceTemperature() {
		return 10000000;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		//fallbeschleunigung 
		return (int)(mass*10);
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
		return (int)(mass * 0.8);
	}

	@Override
	public String toString() {
		return "WeisserZwerg [mass=" + mass + "]";
	}

}
