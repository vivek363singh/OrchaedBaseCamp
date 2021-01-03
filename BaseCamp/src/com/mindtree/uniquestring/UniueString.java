package com.mindtree.uniquestring;

import java.util.Scanner;

public class UniueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		System.out.println("Unique String : "+unique(input));

	}

	static boolean unique(String s) {
		for(int i=0;i<s.length()-1;i++) 
			for(int j=i+1;j<s.length();j++) 
				if(s.charAt(i)==s.charAt(j)) 
					return false;
	

		return true;

	}
}
