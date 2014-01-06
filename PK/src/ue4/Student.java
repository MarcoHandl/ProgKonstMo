package ue4;

public class Student extends Mensch {

	private int matNr;

	public Student(String name, int weight, int size, int matNr) {
		super(name, weight, size);
		this.matNr = matNr;
	}

	@Override
	public String toString() {
		return "Student [matNr=" + matNr + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + matNr;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		//da hier eine vererbte Methode vorliegt 
		//muss man hier auch die Superklassen vergleichen
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (matNr != other.matNr)
			return false;
		return true;
	}
}
