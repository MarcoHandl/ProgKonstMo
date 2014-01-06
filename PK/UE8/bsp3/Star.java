package bsp3;



public interface Star {

	/**
	 * @return new Type of Star or </br>
	 * OutOfTime Exception if Star is expired
	 * @throws OutOfTime
	 */
	Star advanceTime () throws OutOfTime ;
	
	/**
	 * @param other
	 * @throws PhysicallyImpossible
	 */
	void collide(Star other) throws PhysicallyImpossible;
	
	/**
	 * sets the Mass of the Star
	 * @param newMass must be greater then 0
	 */
	void setMass(double newMass);
	
	// (4)
	// 		void accretion(Star other, int mass);
	
	/**
	 * @return actual surface temperature >= 0K 
	 */
	int getSurfaceTemperature ();
	
	/**
	 * @return surfacegravitational acceleration >= 0
	 */
	int getSurfaceGravitationalAcceleration ();
	
	/**
	 * @return Mass of the Star >= 0
	 */
	double getMass ();
	
	/**
	 * @return size of the Star >= 0
	 */
	int getSize ();
	
	/**
	 * @return brightness >= 0
	 */
	int getIntrinsicBrightness ();
	

	
}
