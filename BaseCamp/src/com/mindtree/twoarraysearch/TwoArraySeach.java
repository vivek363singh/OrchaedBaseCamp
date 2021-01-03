package com.mindtree.twoarraysearch;

import java.util.Scanner;

public class TwoArraySeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();

		}
		
		System.out.println("Enter");
		int n1= sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();

		}
		
		TwoArraySeach obj = new TwoArraySeach();
		
		System.out.println("Search successful : "+obj.search(arr1,arr));

	}
	
	boolean search(int[] a1,int[] a2){
		boolean flag=false;
		System.out.println(a1.length+" "+a2.length);
		for(int i=0;i<a1.length;i++) {
			flag=false;
			for(int j=0;j<a2.length;j++)
				if(a1[i]==a2[j])
					flag=true;
			
			
			if(!(flag))
				return flag;
		}
		System.out.println(flag);
		return flag;
		
	}

}
