package bsp1;

public class Gaswolke implements Star {

	private double mass;
	
	public Gaswolke(double mass) {
		super();
		this.mass = mass;
	}

	@Override
	public Star advanceTime() throws OutOfTime {
		return new Hauptreihenstern(this.mass);
	}

	@Override
	public int getSurfaceTemperature() {
		return 10;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		//fallbeschleunigung 
		return (int)(mass*0.8);
	}

	@Override
	public double getMass() {
		return this.mass;
	}

	@Override
	public int getSize() {
		return (int)(mass * 10);
	}

	@Override
	public int getIntrinsicBrightness() {
		return (int)(mass * 0.2);
	}

	@Override
	public String toString() {
		return "Gaswolke [mass=" + mass + "]";
	}

}
