package com.mindtree.shuffleCharacters_1;
import java.util.*;

public class ShuffkeChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input =sc.next();
		System.out.println(shuffle(input));
		sc.close();

	}
	
	static String shuffle(String s) {
		String ShuffeledString="";
		int l=0,r=s.length()-1;
		boolean flag=true;
		
		while(l<=r) {
			if(flag) {
			if(s.charAt(l)>=65 && s.charAt(l)<=90)
				ShuffeledString +=(char)(s.charAt(l)+32);
			else
				ShuffeledString +=(char)(s.charAt(l));
			l++;
			flag=false;
			}
			else {
				if(s.charAt(r)>=65 && s.charAt(r)<=90)
					ShuffeledString +=(char)(s.charAt(r));
				else
					ShuffeledString +=(char)(s.charAt(r)-32);
				
				r--;
				flag=true;
				
			}
		}
		
		return ShuffeledString;
	}

}
