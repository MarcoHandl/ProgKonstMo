package ue6;

import java.util.Stack;


public class Cycle {

	private int elem ;
	private Cycle next ;
	Stack<String> s = new Stack<>();
	
	public Cycle ( int value , Cycle cycle ) {
		elem = value;
		if ( cycle == null ) {
			next = this;
		} else {
			next = cycle.next;
			cycle.next = this;
		}
	}
	
	public Cycle ( int value) {
		this(value, null);
	}
	
	public int count(){
		int c = 0;
		Cycle cy = this;
		
		for(c = 0; ; c++){
			cy = cy.next;
			if(cy == this)
				break;
		}
		return c;
	}
	
	private String listAll(int counter){
		if(counter > 0)
			return elem + "; " + next.listAll(counter -1);
		else
			return elem + "\n";		
	}
	
	@Override
	public String toString(){
		return listAll(this.count());	
	}

	public int getFirst(){
		return elem;
	}
	
	private int myGetIndex(int index, int count){
		if(index == count)
			return elem;
		return next.myGetIndex(index, count+1);
	}
	
	public int getIndex(int n){
		return myGetIndex(n, 0);
	}
	
	public int getLast(){
		return myGetIndex(this.count(),0);
	}
	
	private int sum(int counter){
		if(counter > 0)
			return elem + next.sum(counter -1);
		else
			return elem;		
	}
	
	public int fold(){
		return sum(this.count());
	}
	
	private Cycle myGetCIndex(int index, int count){
		if(index == count)
			return this;
		return next.myGetCIndex(index, count+1);
	}
	
	private Cycle myReverseMap(int count){
		if(count == this.count())
			return new Cycle(elem % 5, null);
		return new Cycle(elem % 5, next.myReverseMap(++count));
	}
	
	private Cycle myMap(int count, Cycle c){
	
		if(count < 0)
			return c;
	
		return next.myMap(--count, new Cycle(elem % 5, c));
	}
	
	private Cycle myReduce(int count, Cycle c){
		
		if(count < 0)
			return c;
		
		if(elem < 0)
			return next.myReduce(--count, c);
		
		return next.myReduce(--count, new Cycle(elem % 5, c));
	}
	

	public Cycle map(){
		return myMap(this.count(),null).myGetCIndex(1, 0);
	}
	
	public Cycle reduce(){
		return myReduce(this.count(),null).myGetCIndex(1, 0);
	}
	
	
	public boolean equals(Object that){
		if(this == that)
			return true;
		if(that == null)
			return false;
		if(this.getClass() != that.getClass())
			return false;
		if( ((Cycle)that).elem != this.elem)
			return false;
				
		return true;
	}
	
		
}
