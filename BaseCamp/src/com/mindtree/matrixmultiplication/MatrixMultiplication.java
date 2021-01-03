package com.mindtree.matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no of row columns of the first matrix");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Enter the no of row columns of the second matrix");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int[][] m1 = new int[r1][c1];
		int[][] m2 = new int[r2][c2];
		System.out.println("Enter the elements of first matrix");
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				m1[i][j]=sc.nextInt();
		System.out.println("Enter the elements of second matrix");
		for(int i=0;i<r2;i++)
			for(int j=0;j<c2;j++)
				m2[i][j]=sc.nextInt();
		int[][] m3=multiplication(m1,m2,r1,c1,r2,c2);
		printMatrix(m3,r1,c2);



	}

	static int[][] multiplication(int[][] m1,int[][] m2,int r1,int c1,int r2, int c2){

		int[][] m3 = new int[r1][c2];

		for(int i=0;i<r1;i++)
			for(int j=0;j<c2;j++)
				for(int k=0;k<r2;k++)
					m3[i][j]+=m1[i][k]*m2[k][j];
		return m3;

	}

	static void printMatrix(int m3[][], int r1, int c2) 
	{ 
		for (int i = 0; i < r1; i++) { 
			for (int j = 0; j < c2; j++) 
				System.out.print(m3[i][j] + " "); 

			System.out.println(); 
		} 
	} 

}
