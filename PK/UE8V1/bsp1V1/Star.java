package bsp1V1;

public interface Star {

	void advanceTime () throws OutOfTime ;
	// (3)
	// void collide(Star other)
	// 		throws PhysicallyImpossible;
	// (4)
	// 		void accretion(Star other, int mass);
	int getSurfaceTemperature ();
	int getSurfaceGravitationalAcceleration ();
	double getMass (); //auf double ge�ndert
	int getSize ();
	int getIntrinsicBrightness ();
	
}
