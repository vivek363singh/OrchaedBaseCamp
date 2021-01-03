package com.mindtree.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		
		
		System.out.println("Enter size");
		n=sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int parr[]= prime(arr);
		for(int i=0;i<parr.length;i++)
			if(parr[i]!=0)
				System.out.println(parr[i]);

	}
	
	static int[] prime(int[] arr) {
		
		int k=0;
		int[] rarr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(prime(arr[i])) {
				rarr[k]=arr[i];
				k++;
			}
		}
		
		return rarr;
	}
	
	static boolean prime(int n) {
		
		for(int i=2;i<=n/2;i++)
			if(n%i==0)
				return false;
		return true;
		
	}

}
