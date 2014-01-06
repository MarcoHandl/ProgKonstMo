package bsp4;

public class SchwarzesLock implements Star {

	private double mass;
	
	public SchwarzesLock(double mass) {
		super();
		this.mass = mass;
	}
	
	@Override
	public Star advanceTime() throws OutOfTime {
		throw new OutOfTime();
	}

	@Override
	public int getSurfaceTemperature() {
		return 30;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		//fallbeschleunigung 
		return (int)(mass*100.0);
	}

	@Override
	public double getMass() {
		return this.mass;
	}

	@Override
	public int getSize() {
		return (int)(mass * 0.4);
	}

	@Override
	public int getIntrinsicBrightness() {
		return (int)(mass * 0);
	}

	@Override
	public String toString() {
		return "SchwarzesLock [mass=" + mass + "]";
	}
	
	@Override
	public void collide(Star other) throws PhysicallyImpossible {
		new SameSame().collide(this, other);
	}

	@Override
	public void setMass(double newMass) {
		this.mass = newMass;
	}

	@Override
	public void accretion(Star other, int mass) {
		new SameSame().accretion(this, other, mass);
	}
}
