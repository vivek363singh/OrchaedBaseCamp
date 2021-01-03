import java.util.Scanner;

public class Challenge {

	
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


	static long ones(int n)
	{
		long i=1,m=11,a=10;
		
		while(true) {
			
			m=a+1;
			if(m%n==0)
				return m;
			a=m*10;
		}
			
	}
}
