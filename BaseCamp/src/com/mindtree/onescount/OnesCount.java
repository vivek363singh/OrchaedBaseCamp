package com.mindtree.onescount;

import java.util.Scanner;

public class OnesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n=0;


		System.out.println("Enter");
		n=sc.nextInt();

		if(n%2!=0 && n%5!=0) {

			System.out.println("Total ones "+ones(n));

		}
		else {
			System.out.println("Divisble by 2 or 5");
		}


	}

	static long ones(int n) {

		int i=1,x=0,m=n;

		while(true) {
			int rem=0;boolean flag=true;
			long temp=m;
			while(m>0) {
				rem=m%10;
				if(rem!=1)
				{
					flag=false;
					break;
				}
				m/=10;
			}
			System.out.println(m);

			if(flag)
			{
				return temp;
			}
			else
			{
				m=n*i;
				i++;
				System.out.println(i);

			}
		}
	}
}
