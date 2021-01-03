package com.mindtree.voweloccurences;

import java.util.Scanner;

public class VowelOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		System.out.println("Enter total no of vowels : "+vowel_count(s));;

	}
	
	static int vowel_count(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			boolean condition = s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' ||s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U';
			if(condition)
				count++;
		}
		
		return count;
	}

}
