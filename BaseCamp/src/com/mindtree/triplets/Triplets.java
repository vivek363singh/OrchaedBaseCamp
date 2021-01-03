package com.mindtree.triplets;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Triplets obj = new Triplets();
		System.out.println("Triplets absent: "+obj.triplets(arr));
	}

	boolean triplets(int[] arr) {
		int n=arr.length;
		for(int i=0;i<=n-3;i++) {
			int count=1;
			for(int j=i+1;j<i+3;j++) {
				if(arr[i]!=arr[j]) 
					break;
				count++;
				if(count==3)
					return false;
			}
		}

		return true;
	}

}
