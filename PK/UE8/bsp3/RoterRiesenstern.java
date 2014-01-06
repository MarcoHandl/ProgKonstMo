package bsp3;

public class RoterRiesenstern implements Star {

	private double mass;
	
	public RoterRiesenstern(double mass) {
		super();
		this.mass = mass;
	}
	
	@Override
	public Star advanceTime() throws OutOfTime {
		return (mass < 1.44) ? new WeisserZwerg(mass) : new SuperNova(mass);
	}

	@Override
	public int getSurfaceTemperature() {
		return 100000000;
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		//fallbeschleunigung 
		return (int)(mass*40.0);
	}

	@Override
	public double getMass() {
		return this.mass;
	}

	@Override
	public int getSize() {
		return (int)(mass * 5);
	}

	@Override
	public int getIntrinsicBrightness() {
		return (int)(mass * 3);
	}

	@Override
	public String toString() {
		return "RoterRiesenstern [mass=" + mass + "]";
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
