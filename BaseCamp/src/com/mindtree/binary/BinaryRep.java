package com.mindtree.binary;

import java.util.Scanner;

public class BinaryRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n =sc.nextInt();
		
		System.out.println(zerocount(n));
	}
	
	static int zerocount(int n) {
		String s="";
		int count=0;
		while(n>0) {
			s+=n%2;
			n=n/2;

		}

		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0')
				count++;
		}
	
		return count;
	}

}
