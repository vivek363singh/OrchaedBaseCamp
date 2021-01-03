package com.mindtree.parking;

import java.util.Scanner;

public class ParkingTicket {

	static int i=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		int c=0; String no="",time="";

		Parking[] park = new Parking[100];

		boolean flag = true;
		while(flag)
		{

			do {
				System.out.println("1. Parking check\n2. Enter vehicle number\n3. Enter time of vechicle\n4. Allocation of parking\n5.Calculate fee");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
				}
			}while(c<=0 && c>6);


			ParkingTicket obj = new ParkingTicket();

			switch(c)
			{

			case 1:				
				System.out.println(obj.Parking_Check()); break;

			case 2:		
				no=obj.enter_no(); break;

			case 3:

				time=obj.Time(); break;

			case 4:

				obj.allocation(park,no,time); break;

			case 5:
				System.out.println(obj.fee(park)+" for vechicle no "+ park[i-1].getVechicle_no()); flag=false;


			}
		}
	}

	private boolean Parking_Check(){

		if(i<100)
			return true;
		else 
			return false;

	}

	private	String enter_no() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no");
		String no = sc.next();

		return no;

	}

	private	String Time() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter time");
		String time = sc.next();

		return time;

	}

	private void allocation(Parking[] park,String no, String time) {

		park[i]=new Parking(no,time);
		System.out.println("Parking allocated");
		i++;

	}

	float fee(Parking[] park) {

		Scanner sc = new Scanner(System.in);
		int f1=0,f2=0;
		float f=0;
		System.out.println("Enter time in HH:MM format");
		String time =sc.next();
		int hours = (time.charAt(0)-'0')*10 + (time.charAt(1)-'0');	
		
		int minutes = (time.charAt(3)-'0')*10 + (time.charAt(4)-'0');
		System.out.println(minutes);
		f2=(hours*60)+minutes;
		

		String time1=park[i-1].getTime();
		int hours1 = (time1.charAt(0)-'0')*10 + (time1.charAt(1)-'0');		
		int minutes1 = (time1.charAt(3)-'0')*10 + (time1.charAt(4)-'0');
		f1=(hours1*60)+minutes1;
		System.out.println(f2);
		float total_hour = (f2-f1)/60;


		if(total_hour<=2)
		{
			if((f2-f1)%60!=0)
				f=(total_hour)*50+50;
			else
				f=(total_hour)*50;
		}
		else
		{
			if((f2-f1)%60!=0)
				f = 50*2 + (total_hour-2)*30+30;
			else
				f = 50*2 + (total_hour-2)*30;		
		}

		return f;
	}


}
