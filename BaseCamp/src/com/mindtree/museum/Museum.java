package com.mindtree.museum;

import java.util.Scanner;

public class Museum {

	static int i=0;
	public static void main(String[] args) {

		Visitors[] visitors = new Visitors[1000];
		Scanner sc = new Scanner(System.in);
		boolean flag = true; int c=0;
		while(flag)
		{

			do {
				System.out.println("1. Add customer details\n2. Fees\n3. No of vistors per day\n"
						+ "4. No f visitors in an age range\n5. Ratio of female to male\n6. Total earning per day from museum");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
				}
			}while(c<=0 && c>7);
			
			Museum obj = new Museum();
			
			switch(c)
			{
			case 1: obj.add(visitors); break;
			
			case 2: System.out.println(obj.fees(visitors)); break;
			
			case 3:System.out.println(i); break;
			
			case 4:System.out.println("No of visitors in range: "+obj.age_range(visitors)); break;
			
			case 5:System.out.println("Ratio of female to male : "+ obj.ratio(visitors)); break;
			
			case 6:System.out.println("Total earning : "+obj.earning(visitors));
			
			}

		}

	}
	
	private void add(Visitors[] visitors) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter gender");
		String gender=sc.next();
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		visitors[i] = new Visitors(name,gender,age);
		i++;
	
	}
	
	private int fees(Visitors[] visitors) {
		int age=visitors[i-1].getAge();
		
		if(age<5)
			{
			visitors[i-1].setFees(0);
			return 0;
			}
		else if(age>=5 && age<18)
		{
			visitors[i-1].setFees(10);
			return 10;
		}
		else if(age>=18 && age<60)
			{
			visitors[i-1].setFees(20);
			return 20;
			}
		else
			{
			visitors[i-1].setFees(5);
			return 5;
			}
	}

	private int age_range(Visitors[] visitors) {

		
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter age range");
		int l=sc.nextInt();
		int h=sc.nextInt();
		
		for(int j=0;j<i;j++)
			if(visitors[j].getAge()>=l && visitors[j].getAge()<=h)
				count++;
		
		return count;
		
	}

	private String ratio(Visitors[] visitors) {
		int count1=0,count2=0;
		
		for(int j=0;j<i;j++)
		{
			if(visitors[j].getGender().equals("male"))
				count1++;
			else
				count2++;
		}
		
		return count2+" : "+count1;
	}

	private int earning(Visitors[] visitors) {
		
		int earn=0;
		for(int j=0;j<i;j++) {
			
			int age=visitors[j].getAge();
			
			if(age<5)
				earn+=0;
			else if(age>=5 && age<18)
				earn+=10;
			else if(age>=18 && age<60)
				earn+=(20);
			else
				earn+=5;
		}
		
		return earn;
	}

}
