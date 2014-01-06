package ue6Test;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cycle c0 = new Cycle(0,null);
		Cycle c1 = new Cycle(2,c0);
		Cycle c2 = new Cycle(4,c1);
		Cycle c3 = new Cycle(6,c2);
		Cycle c4 = new Cycle(8,c3);
		Cycle c5 = new Cycle(10,c4);
		
		System.out.println(c0.toString());
		System.out.println("count()  : " + c0.count());
		System.out.println("countRec()  : " + c0.countRec(c0));
		System.out.println("getLastRec()  : " + c0.getLastRec(c0));
		System.out.println(c0.equals(new Cycle(0, null)));
		
		
		System.out.println("c0.getFirst() : " + c0.getFirst());
		System.out.println("c0.getIndex(1): " + c0.getIndex(1));
		System.out.println("c0.getIndex(2): " + c0.getIndex(2));
		System.out.println("c0.getIndex(5): " + c0.getIndex(5));
		System.out.println("c0.getIndex(7): " + c0.getIndex(7));
		System.out.println("c0.getLast()  : " + c0.getLast());
		
		System.out.println("c0.fold()  : " + c0.fold());
		System.out.println("c0.mapMul2()  : " + c0.mapMul2());
		
		System.out.println("c0.map(): " + c0.map());
		
		
		Cycle r0 = new Cycle(-1,null);
		Cycle r1 = new Cycle(-2,r0);
		Cycle r2 = new Cycle(4,r1);
		Cycle r3 = new Cycle(5,r2);
		Cycle r4 = new Cycle(8,r3);
		Cycle r5 = new Cycle(-9,r4);
		
		System.out.println("r0.addEven " + r0.addEven());
		System.out.println("r0.addOdd " + r0.addOdd());
		
		System.out.println("r0.reduce(): " + r0.reduce());
		System.out.println("r0.map(): " + r0.map());
			
	}

}
