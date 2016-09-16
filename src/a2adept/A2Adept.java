package a2adept;

import java.util.Scanner;

public class A2Adept {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int binSize = s.nextInt();	
		int numCol = s.nextInt();
		int numRow = s.nextInt();
		
		int size = numCol*numRow;
		
		double numBin = Math.ceil(100.0/binSize);
		
		int [] array = new int [(int) numBin];
	
		for (int i = 0; i<size; i++ ) { //read in all 9 values, placing them into correct bin
			int value = s.nextInt();
			 int x = value/binSize;		 
			 array[x]++;	
		}
		
		for (int i=0; i<array.length; i++) {
			
			int star = (int)(((array[i]/(double) size)*100)+.5); // saying how many start to have
			
			if (i*binSize < 10) {System.out.print(" " + i*binSize + ":" );} //putting all on same line until println is said
			else {System.out.print(i*binSize + ":");}
			
			for (int w=0; w<star; w++) { //go till number of stars and print * for each
				System.out.print("*");
				
			}
			
			System.out.println(); //this puts the stars on the same line
			
		}	
		
		s.close();
	}	
}
