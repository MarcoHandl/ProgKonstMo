package ue2;

public class Gras implements IFood {

	private String name;
	private double kcal;
	
	public Gras() {
		this.name = "Weed";
		this.kcal = 12.0;
	}

	
	public String getName() {
		return name;
	}


	public double getKcal() {
		return kcal;
	}

	@Override
	public String toString() {
		return "Gras [name=" + name + ", kcal=" + kcal + "]";
	}


	@Override
	public boolean equals(Object that) {
		if(this == that)
			return true;
		if(that == null)
			return false;
		if(this.getClass() != that.getClass())
			return false;
		if(!super.equals(that))
			return false;
		//class specific
		if(((IFood)that).getName() != this.name)
			return false;
		if(((IFood)that).getKcal() != this.kcal)
			return false;

		return true;
	}
}
