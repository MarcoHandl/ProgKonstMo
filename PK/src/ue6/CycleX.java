package ue6;

public class CycleX extends Cycle {

	private int bla;
	
	public CycleX(int value, Cycle cycle, int bla) {
		super(value, cycle);
		this.bla = bla;
	}

	public boolean equals(Object that){
		
		if(this == that)
			return false;
		if(!super.equals(that))
			return false;
		if(this.getClass() != that.getClass())
			return false;
		if(((CycleX)that).bla != this.bla)
			return false;
		return true;
	}
	
	
	
	
}
