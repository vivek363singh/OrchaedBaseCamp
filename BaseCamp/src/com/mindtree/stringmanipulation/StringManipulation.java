package com.mindtree.stringmanipulation;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s=sc.next();
		int n = sc.nextInt();
		StringManipulation obj = new StringManipulation();
		System.out.println(obj.copies(s,n));;
	}	

  String copies(String s,int n) {
		String s1="";
		if(s.length()<3) {
			for(int i=0;i<s.length();i++)
				s1+=s.charAt(i);
			for(int i=1;i<n;i++)
				s1+=s1;
			return s1;
		}
		
		else {
			for(int i=0;i<3;i++)
				s1+=s.charAt(i);
			for(int i=1;i<n;i++)
				s1+=s1;
			return s1;
		}

	}
}
