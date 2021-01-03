package com.mindtree.IT;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the income");
		int income = sc.nextInt();
		
		System.out.println("Income tax for "+income+" is "+ income_tax(income));;

	}

	static double income_tax(int income) {
		
		if(income<=50000)
			return 0;
		else if(income>5000&&income<=60000)
			return income*.10;
		else if(income>60000&&income<=150000)
			return income*.20;
		else 
			return income*.30;
	}
	
}
