package com.mindtree.WordApp;

import java.util.Scanner;

public class Wordapp {

	public static void main(String[] args) {


		int c=0;
		boolean flag=true;

		Scanner sc = new Scanner(System.in);

		String input="";

		while(flag) {

			do {
				System.out.println("1. Input a sentence\n2. count total word\n3. Count total vowels\n4. Arrays of words\n6.Exit");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
					c=0;
				}
			}while(c<=0 && c<6);


			switch(c) {

			case 1:input=Input(); break;
			
			case 2: System.out.println("Total no of words  "+count_words(input)); break;
			
			case 3: System.out.println("Total no of vowels  "+ count_vowels(input)); break;
			
			case 4: String[] arr=words_array(input,count_words(input)); 
					for(int i=0;i<arr.length;i++)
						System.out.println(arr[i]);
					break;
			
			case 5: flag=false; System.out.println("Thank you");
			
			}


		}


	}

	static String Input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sentence");

		String input=sc.nextLine();

		return input;
	}

	static int count_words(String s) {
		int count=1;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==' ')
				count++;
	return count;
	}

	static int count_vowels(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			boolean condition = s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' ||s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U';
			if(condition)
				count++;
		}
		
		return count;
	}

	static String[] words_array(String s,int n) {
		
		String[] arr = new String[n];
		
		for(int i=0;i<arr.length;i++)
			arr[i]="";
		
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') 
				arr[j]+=s.charAt(i);
			if(s.charAt(i)==' ')
				j++;
		}
		
		return arr;
	}
}
