package ue4;

public class Main {

	public static void main(String[] args) {
		
		
		Mensch p1 = new Mensch("Willi", 70, 190);
		Mensch p2 = new Mensch("Klaus", 90, 185);
		Mensch p3 = new Mensch("Willi", 70, 190);
		
		
		Student s1 = new Student("Hans", 80, 180, 1025510);
		Student s2 = new Student("Klaus", 90, 185, 1025511);
		Student s3 = new Student("Hans", 80, 180, 1025510);
		
		System.out.println(s2.equals(p2));
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
		Mensch x1 = s1;
		
		System.out.println(s1.toString());
	}

}
