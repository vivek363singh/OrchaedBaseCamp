package com.mindtree.stringmirror;

import java.util.Scanner;

public class StringMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total no of arrays");
		int n=sc.nextInt();
		
		String[] arr = new String[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.next();
		mirror(arr);
	}
	
	static void mirror(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println((reverse(arr[i])));
		}
	}
	
	static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		return rev;
	}

}
