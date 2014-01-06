package ue1;

public class Bsp1Onehundert {

	public static void ausgeben(int i){
		if(i % 3 == 0 && i % 5 == 0)
			System.out.println("FizzBuzz");
		else if(i % 3 == 0)
			System.out.println("Fizz");
		else if(i % 5 == 0)
			System.out.println("Buzz");
		else
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
			ausgeben(i);
	}
}
