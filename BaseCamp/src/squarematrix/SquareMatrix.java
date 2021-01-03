package squarematrix;

import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		String s="";
		int c=0,n=0;
		
		
		char[][] arr= new char[n][n];


		while(flag) {

			do {
				System.out.println("1. Dimension of matrix\n2. Fill characters\n3. Input string\n4. Search for string\n5 .Exit");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
					c=0;
				}
			}while(c<=0 && c<6);

			switch(c)
			{
			case 1: n=dimension(); break;
			
			case 2:arr =fill(n); break;
			
			case 3: s=sc.next(); break;
			
			case 4:  System.out.println("String found  :  "+search(arr,n,s)); break;
			
			case 5: System.out.println("Thank you");flag=false;
			}
		}

	}

	static int dimension(){
		Scanner sc = new Scanner(System.in);
		int n=0;
		boolean flag=true;
		while(flag) {
			if(sc.hasNextInt()) {

				n=sc.nextInt();
				sc.nextLine();
				flag=false;
			}
			else {
				sc.nextLine();
				System.out.println("Invalid input");
			}
		}
		
		return n;
	}

	static char[][] fill(int n){
	
		Scanner sc = new Scanner(System.in);
		
		char[][] arr = new char[n][n];
		
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.next().charAt(0);
			
		return arr;
	}

	static boolean search(char[][] arr,int n,String s) {
		
		//Row Checking
		for(int i=0;i<arr.length;i++) {
			String input="";
			for(int j=0;j<arr.length;j++)
				{
				input+=arr[i][j];
				if(s.equals(input))
					return true;
				}
			
		}
		
		//Column checking
		for(int i=0;i<arr.length;i++) {
			String input="";
			for(int j=0;j<arr.length;j++)
				{
				input+=arr[j][i];
				if(s.equals(input))
					return true;
				}
			
			
		}
		
		//Diagonal Checking
		String input="";
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(i==j)
					input+=arr[i][j];	
			
			if(s.equals(input))
				return true;
		}
		
		return false;
	}

}
