package ue6Test;


public class Cycle {

	private int elem ;
	private String name;
	private Cycle next ;
	
	
	public Cycle(int elem, Cycle cycle){
		
		this.elem = elem;
		if(cycle == null){
			this.next = this;
		}else{
			this.next = cycle.next;
			cycle.next = this;
		}
	}
	
	public int count(){
		int i = 0;
		Cycle myNext = this;
		
		do{
			i++;
			myNext = myNext.next;
		}while(this != myNext);
		
		return i;
	}
	
	public int countRec(Cycle first){
		
		if(next == first)
			return 1;
		
		return 1 + next.countRec(first);
		
	}
	
	public String toString(){
		String retVal = "";
		Cycle c = this;
		
		do{
			retVal += c.elem + "; ";
			c = c.next;
		}while(c != this);
		
		return retVal;
	}
	
	public boolean equals(Object that){
		if(this == that)
			return true;
		if(that == null)
			return false;
		//if(!super.equals(that))
		//	return false;
		if(this.getClass() != that.getClass())
			return false;
		Cycle o = (Cycle)that;
		if(this.elem != o.elem)
			return false;
		if(this.name == null){
			if(o.name != null)
				return false;
		}else if(!this.name.equals(o.name))
			return false;
		
		return true;
		
	}
	
	public int getFirst(){
		return elem;
	}

	public int getLastRec(Cycle start){
		
		if(next == start)
			return elem;
		
		return next.getLastRec(start);
	}
	
	public int getLast(){
		Cycle c = this;
		
		do{
			c = c.next;
		}while(c.next != this);
		
		return c.elem;
	}
	
	public int addEven(){
		
		Cycle c = this;
		int retVal = 0;
		
		do{
			if(c.elem % 2 == 0)
				retVal += c.elem;
			c = c.next;
		}while(c != this);
		
		return retVal;
		
	}
	
	public int addOdd(){
		
		Cycle c = this;
		int retVal = 0;
		
		do{
			if(c.elem % 2 == 1)
				retVal += c.elem;
			c = c.next;
		}while(c != this);
		
		return retVal;
	}
	
	public int getIndex(int n){
		Cycle c = this;
		
		for(int i=0; i<n; i++)
			c = c.next;
		
		return c.elem;
		
	}
	
	public int fold(){
		Cycle c = this;
		int retVal = 0;
		do{
			retVal += c.elem;
			c = c.next;
		}while(c != this);
		
		return retVal;
	}
	
	public int mapMul2(){
		
		Cycle c = this;
		int retVal = 0;
		
		do{
			retVal += c.elem * 2;
			c = c.next;
		}while(c != this);
		
		return retVal;
		
	}
	
 	private Cycle myMap(int count, Cycle c){
		
		if(count <= 0)
			return c;
		
		return next.myMap(--count, new Cycle(elem % 5, c));
	}
	
 	private Cycle myMap(Cycle start, Cycle c){
 		
 		if(this.next == start)
 			return new Cycle(elem % 5,c);
 		
 		return next.myMap(start, new Cycle(elem % 5,c));
 		
 	}
 	
	public Cycle map(){	
		//return myMap(this.count(),null).next;
		return myMap(this,null).next;
	}
	
	private Cycle myReduce(int count, Cycle c){
		
		if(count < 0)
			return c;
		
		if(elem < 0)
			return next.myReduce(--count, c);
		
		return next.myReduce(--count, new Cycle(elem % 5, c));
		
	}
	
	private Cycle myReduce(Cycle start, Cycle c){
		
		if(this.next == start)
			if(this.elem < 0)
				return c;
			else
				return new Cycle(elem,c);
		
		if(elem < 0)
			return next.myReduce(start, c);
		else
			return next.myReduce(start, new Cycle(elem,c));
		
		
	}
	
	public Cycle reduce(){
		//return this.myReduce(this.count(), null).next;
		return this.myReduce(this, null).next;
	}
	
}
