package ue1;

public class Bsp6Computer {

	private static byte [] memory = new byte[50];
	
	public static void main(String [] args) throws InterruptedException{
		
		//fill memory
		for(int i=0; i< memory.length; i++)
			memory[i] = (byte) i;
		
		int j = 0;
		//Routine
		while(true){
			byte cmd = memory[j];
			if (j++ >= memory.length-1)
				j = 0;
			System.out.println("PC:" + j + " memVal: " + cmd);
			Thread.sleep(100);
		}
	}
}
