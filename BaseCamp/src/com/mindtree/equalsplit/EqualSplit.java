package com.mindtree.equalsplit;

import java.util.Scanner;

public class EqualSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		EqualSplit obj = new EqualSplit();
		System.out.println("Able to split : "+obj.split(arr));;
		}
	
	boolean split(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int sum1=0,sum2=0;
			for(int j=0;j<=i;j++)
				sum1+=arr[j];
			
			for(int j=i+1;j<arr.length;j++)
				sum2+=arr[j];
			if(sum1==sum2)
				return true;
			
		}
		
		return false;
	}

}
