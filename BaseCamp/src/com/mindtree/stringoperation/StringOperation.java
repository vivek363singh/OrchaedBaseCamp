package com.mindtree.stringoperation;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++) {
			int j;
			for(j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					break;
				}
			}
			if(j==i)
				s1+=s.charAt(i);
		}
		char charArray[] = s1.toCharArray();
		int size=charArray.length;
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(charArray[i]>charArray[j]) {
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=(char) temp;
				}
			}
		}
		String s2="";
		for(int i=0;i<charArray.length;i++)
			s2+=charArray[i];
		
	
		System.out.println(s2);

	}

}
