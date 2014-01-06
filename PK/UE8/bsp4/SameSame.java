package bsp4;

/**
 * gemeinsame Funktionen aller Sterne 
 *
 */
public class SameSame {

	/**
	 * @param me Aufruferstern bekommt Masse
	 * @param other Collisionsstern gibt Masse ab
	 * @throws PhysicallyImpossible
	 */
	public void collide(Star me, Star other) throws PhysicallyImpossible {
		if(other instanceof SchwarzesLock)
			throw new PhysicallyImpossible();
		
		me.setMass(me.getMass() + other.getMass()*0.25);
		other.setMass(other.getMass()*0.75);
	}
	
	/**
	 * VB: me.getMass() >= other.getMass();
	 * IV: es wird maximal die Masse des anderen Stern verschoben
	 * @param me Aufruferstern bekommt Masse
	 * @param other anderer Stern gibt Masse ab
	 * @param mass wieviel abgezogen werden soll
	 */
	public void accretion(Star me, Star other, int mass) {
		assert (me.getMass() >= other.getMass());
		
		if(other.getMass() >= mass){
			me.setMass(me.getMass() + mass);
			other.setMass(other.getMass()- mass);
		}else{
			me.setMass(me.getMass() + other.getMass());
			other.setMass(0);
		}
	}
	
		
	
}
