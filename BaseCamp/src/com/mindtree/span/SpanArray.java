package com.mindtree.span;

import java.util.Scanner;

public class SpanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}

		SpanArray obj = new SpanArray();
		obj.span(arr);
	}
	
	void span(int[] arr) {
		
	}

}
