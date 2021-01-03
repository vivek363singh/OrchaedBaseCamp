package com.mindtree.superior;

import java.util.Scanner;

public class SuperiorElement {

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
		SuperiorElement obj = new  SuperiorElement();
		obj.superior(m,r,c);

	}

	void superior(int[][] m,int r,int c) {

		int max=0,k=0;
		int[] max_r = new int[r*c] ;
		int[] max_c = new int[r*c] ;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(m[i][j]>max)
				{
					max=m[i][j];
					max_r[k]=i;
					max_c[k]=j;
					k++;
				}
			}
		}
		
		System.out.println("("+max_r[k-1]+""+max_c[k-1]+")");

	}

}
