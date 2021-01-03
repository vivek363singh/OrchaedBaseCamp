package com.mindtree.matrixmanipulation;

import java.util.Scanner;

public class MatrixManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row columns of the matrix");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] m = new int[r][c];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				m[i][j]=sc.nextInt();
		int[][] rm=manipulation(m,r,c);
		
		printMatrix(rm,r,c);

	}

	static int[][] manipulation(int[][] m,int r,int c){
		
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				m[i][j]*=(i+1);
		
		return m;
		
	}
	
	static void printMatrix(int rm[][], int r, int c) 
	{ 
		for (int i = 0; i < r; i++) { 
			for (int j = 0; j < c; j++) 
				System.out.print(rm[i][j] + " "); 

			System.out.println(); 
		} 
	} 
}
