package com.mindtree.email;

import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s=sc.next();

		Email obj1 = new Email();
		if(obj1.str_validation(s)) {
			Email obj2 = new Email();
			obj2.percent(s);
			
		}
		else {
			System.out.println("Invalid mail address");
		}

	}

	boolean str_validation(String s) {

		if(s.charAt(0)!='@' && s.charAt(s.length()-1)!='@')
			return true;
		else return false;
	}
	
	void percent(String s) {
		float scount=0,bcount=0,dcount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				scount++;
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				bcount++;
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
				dcount++;
		}
		
		System.out.println("Percentage of lower characters :"+((scount*100)/(s.length()-1)));
		System.out.println("Percentage of uper characters :"+((bcount*100)/(s.length()-1)));
		System.out.println("Percentage of digit characters :"+((dcount*100)/(s.length()-1)));
	}
}


