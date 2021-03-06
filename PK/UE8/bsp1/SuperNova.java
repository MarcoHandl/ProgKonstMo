package bsp1;

public class SuperNova implements Star {

	private double mass;
	
	public SuperNova(double mass) {
		super();
		this.mass = mass;
	}
	
	@Override
	public Star advanceTime() throws OutOfTime {
		return (mass < 3) ? new Neutronenstern(mass) : new SchwarzesLock(mass);
	}

	@Override
	public int getSurfaceTemperature() {
		return 1000000000;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		//fallbeschleunigung 
		return (int)(mass*60);
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
		return (int)(mass * 6);
	}

	@Override
	public String toString() {
		return "SuperNova [mass=" + mass + "]";
	}

	
}
