package bsp4;

public interface Star {
	Star advanceTime () throws OutOfTime ; //geänder
	void collide(Star other) throws PhysicallyImpossible;
	void setMass(double newMass); //neu hinzu
	void accretion(Star other, int mass);
	int getSurfaceTemperature ();
	int getSurfaceGravitationalAcceleration ();
	double getMass ();
	int getSize ();
	int getIntrinsicBrightness ();
}
