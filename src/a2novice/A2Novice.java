package a2novice;

import java.util.Scanner;

public class A2Novice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numCol = s.nextInt();	
		int numRow = s.nextInt();	
		
		int [][] array  = new int[numRow][numCol];
		
		for (int c=0; c<numCol; c++){
				
			for (int r=0; r<numRow; r++) {
				array[r][c] = s.nextInt();		
			}
			
		}
		for (int r=0; r<numRow; r++){
		for (int c=0; c<numCol; c++) {
			int i = array[r][c]; 
			if (i>=0 && i<10) {System.out.print("#");}
			else if (i<20) {System.out.print("M");}
			else if (i<30) {System.out.print("X");}
			else if (i<40) {System.out.print("D");}
			else if (i<50) {System.out.print("<");}
			else if (i<60) {System.out.print(">");}
			else if (i<70) {System.out.print("s");}
			else if (i<80) {System.out.print(":");}
			else if (i<90) {System.out.print("-");}
			else if (i<100) {System.out.print(" ");}
		 }
		 System.out.println("");
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		double average;
		int sum = 0;
		
		for (int r=0; r<numRow; r++){
			for (int c=0; c<numCol; c++) {
				int i = array[r][c]; 
				if (i<min) {min = i;}
				
			 }
			
			}
		
		for (int r=0; r<numRow; r++){
			for (int c=0; c<numCol; c++) {
				int i = array[r][c]; 
				if (i>max) {max = i;}
				
			 }
			
			}
		
		for (int r=0; r<numRow; r++){
			for (int c=0; c<numCol; c++) {
				int i = array[r][c]; 
				sum += i;
			 }
			}
		average = (double) sum/(numRow*numCol);
		System.out.println("Min value = " + min);
		System.out.println("Max value = " + max);
		System.out.println ("Average value = " + average);
		
		s.close();
	}
	
}
