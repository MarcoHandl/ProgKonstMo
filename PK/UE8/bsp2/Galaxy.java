package bsp2;

import java.util.ArrayList;
import java.util.List;

import bsp1.*;

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

	@Override
	public String toString() {
		return "Galaxy [galaxy=" + galaxy + "]";
	}
}
