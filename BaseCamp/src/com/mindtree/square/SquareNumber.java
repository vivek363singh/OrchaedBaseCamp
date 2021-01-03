package com.mindtree.square;

import java.util.Scanner;

public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<10;i++) {
			int s=arr[i]*arr[i];
			if(i<100)
				System.out.println(s);
		}

	}

}
