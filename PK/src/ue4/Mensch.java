package ue4;

public class Mensch {

	private String name;
	private int weight;
	private int size;
	
	public Mensch(String name, int weight, int size) {
		super();
		this.name = name;
		this.weight = weight;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Mensch [name=" + name + ", weight=" + weight + ", size=" + size
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + size;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mensch other = (Mensch) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

}
