package circularapp;

import java.util.Scanner;

public class CircularApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int n = sc.nextInt();
		Circular(input,n);

	}
	
	static void Circular(String s,int n) {
		
		String cat=s+s;
		for(int i=0;i<cat.length()-s.length();i++) {
			String str="";
			for(int j=i;j<i+3;j++)		
				str+=cat.charAt(j);
		System.out.println(str);		
		}
	}

}
