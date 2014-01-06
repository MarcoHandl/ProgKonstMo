package bsp3;

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

	@Override
	public void collide(Star other) throws PhysicallyImpossible {
		if(other instanceof SchwarzesLock)
			throw new PhysicallyImpossible();
		
		this.mass += other.getMass()*0.25;
		other.setMass(other.getMass()*0.75);
	}

	@Override
	public void setMass(double newMass) {
		assert(newMass >= 0);
		this.mass = newMass;
	}

}
