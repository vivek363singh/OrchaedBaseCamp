package com.mindtree.clock;

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter");
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		
		System.out.println("Angle between "+input+" is "+angle(input));


	}

	static int angle(String s) {

		String hr="",min=""; boolean flag=true; int ih=0,im=0,hour=0,minute=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=':' && flag) {
				hr+=s.charAt(i);

			}
			else if(s.charAt(i)==':'){
				flag=false;	
			}
			else {
				min+=s.charAt(i);
			}
		}

		while( ih<hr.length()) {
			hour*=10;
			hour+=hr.charAt(ih++)-'0';	
		}

		while(im<min.length()) {
			minute*=10;
			minute+=min.charAt(im++)-'0';
		}

		System.out.println(hour+" "+minute);
		int  hr_angle=(hour*360)/12 + (minute*360)/(12*60);

		int min_angle=(minute*360)/60;

		System.out.println(hr_angle +" "+ min_angle);
		if(hr_angle-min_angle>=0)
			return hr_angle-min_angle;
		else
			return min_angle-hr_angle;		
	}

}
