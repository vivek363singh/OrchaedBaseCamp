package com.mindtree.circularstring;

import java.util.Scanner;

public class CircularString {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string");
		String input1 = sc.next();

		System.out.println("Enter second string");
		String input2 = sc.next();

		System.out.println("Circular Strings   : " + DetectCircular(input1,input2));;


	}

	static boolean DetectCircular(String s1, String s2) {

		String cat=s1+s1;

		for(int i=0;i<cat.length()-s2.length();i++) 	
		{
			int j;
			for( j=0;j<s2.length();j++) 	
				if(cat.charAt(i+j)!=s2.charAt(j))
					break;

			if(j==s2.length())
				return true;
		}
		return false;
	}

}
