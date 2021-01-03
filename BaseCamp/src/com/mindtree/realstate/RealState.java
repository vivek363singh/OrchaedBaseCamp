package com.mindtree.realstate;

import java.util.Scanner;

public class RealState {

	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Property[] properties = new Property[1000];

		Scanner sc = new Scanner(System.in);
		boolean flag = true; int c=0;
		while(flag)
		{

			do {
				System.out.println("1. Add property details\n2. list based on type\n3. list based on rent or sale\n"
						+ "4. First based on type and then rent or sale");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
				}
			}while(c<=0 && c>5);
			
			switch(c) 
			{
			case 1: add(properties); break;
			
			case 2: type(properties); break;
			
			case 3: r_s(properties); break;
			
			case 4: t_r_s(properties); break;
			
			}

		}
	}
	
	private  void add(Property[] properties)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name of the property");
		String s=sc.next();
		
		
	}
}
