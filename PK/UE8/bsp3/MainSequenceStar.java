package bsp3;

public class MainSequenceStar implements Star {

	private Star state;
	
	public MainSequenceStar(double mass) {
		super();
		state = new Gaswolke(mass);
	}

	@Override
	public Star advanceTime() throws OutOfTime {		
		state = state.advanceTime();
		return state;
	}

	@Override
	public int getSurfaceTemperature() {
		return state.getSurfaceTemperature();
	}

	@Override
	public int getSurfaceGravitationalAcceleration() {
		return state.getSurfaceGravitationalAcceleration();
	}

	@Override
	public double getMass() {
		return this.state.getMass();
	}

	@Override
	public int getSize() {
		return state.getSize();
	}

	@Override
	public int getIntrinsicBrightness() {
		//spezifische helligkeit
		return state.getIntrinsicBrightness();
	}

	@Override
	public String toString() {
		return state.toString();
	}
	
	@Override
	public void collide(Star other) throws PhysicallyImpossible {
		state.collide(other);
	}

	@Override
	public void setMass(double newMass) {
		state.setMass(newMass);
	}
}
