package bsp4;

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
		 * @param newMass must be >= 0
		 */
		void setMass(double newMass);
		
		/**
		 * moves mass from the other Star to the this star
		 * but maximal the whole mass from the other Star
		 * @param other must be smaller than this 
		 * @param mass >= 0 
		 */
		void accretion(Star other, int mass);
		
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

