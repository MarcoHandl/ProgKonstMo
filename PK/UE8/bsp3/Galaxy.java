package bsp3;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

	private List<Star> galaxy = new ArrayList<Star>();
	
	
	public void add(Star star){
		galaxy.add(star);
	}
	
	public void advanceTime(){
		ArrayList<Star> clear = new ArrayList<Star>();
		
		for(Star s : galaxy){
			try {
				s.advanceTime();
			} catch (OutOfTime e) {
				clear.add(s);
			}
		}
		
		for(Star s : clear)
			galaxy.remove(s);
	}
	
	/**
	 * 
	 * @param galaxy
	 */
	public void collide(Galaxy galaxy){
		
		for(Star s : this.galaxy){
			if(s.getSurfaceGravitationalAcceleration() >= 300){
				for(Star st : galaxy.galaxy){
					if(st.getSurfaceGravitationalAcceleration() <= 100){
						try {
							s.collide(st);
						} catch (PhysicallyImpossible e) {
							
						}
					}
				}
			}
		}
		
		//alle Sonnen von der Galaxy 2 welche größer 300 sind mit 
		//meinen Sonnen <0= 100 kollidieren lassen
		for(Star s : galaxy.galaxy)
			if(s.getSurfaceGravitationalAcceleration() >= 300)
				for(Star st : this.galaxy)
					if(st.getSurfaceGravitationalAcceleration() <= 100)
						try {
							s.collide(st);
						} catch (PhysicallyImpossible e) {
							
						}
	}
	
	
	
	@Override
	public String toString() {
		return "Galaxy [galaxy=" + galaxy + "]";
	}
}
