package bsp3;

public interface Star {

	Star advanceTime () throws OutOfTime ;
	void collide(Star other) throws PhysicallyImpossible;
	void setMass(double newMass);
	//void setMass(double newMass);
	// (4)
	// 		void accretion(Star other, int mass);
	int getSurfaceTemperature ();
	int getSurfaceGravitationalAcceleration ();
	double getMass ();
	int getSize ();
	int getIntrinsicBrightness ();
	
}
