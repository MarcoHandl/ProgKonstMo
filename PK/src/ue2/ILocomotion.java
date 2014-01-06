package ue2;

public interface ILocomotion {

	/**
	 * Wechselt das Objekt in den
	 * n�chsten Bewegungszustand:<br/>
	 * 1.) langsames Bewegen<br/>
	 * 2.) schnelles Bewegen<br/>
	 * 3.) spezielles Bewegen<br/>
	 * und f�hrt diese Bewegung durch.<br/>
	 * Von Zustand 3 wird wieder
	 * zum ersten Zustand
	 * zur�ckgesprungen.
	 * @return
	 */
	public double doTheLocomotion ();
	
	
	/**
	 * Setzt das Objekt in einen
	 * unbewegten Zustand.<br/>
	 * doTheLocomotion f�ngt danach
	 * wieder mit den ersten Zustand an
	 */
	public void stopTheLocomotion ();

}
