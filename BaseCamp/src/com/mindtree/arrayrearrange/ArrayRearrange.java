package com.mindtree.arrayrearrange;

import java.util.Scanner;

public class ArrayRearrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();

		}

		ArrayRearrange obj = new ArrayRearrange();
		
		int[] a=obj.Rearrange(arr);
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

	int[] Rearrange(int[] a) {

		for(int i=0;i<a.length;i++) {
			if(a[i]==3) {
				int index=0;
				for(int j=i;j<a.length;j++)
					if(a[j]==4)
					{
						index=j;
						int temp=a[i+1];
						a[i+1]=a[index];
						a[index]=temp;
						i++;
					}
			}

			if(a[i]==4) {
				int index=i;
				if(index!=a.length-2)
				{
					for(int j=i+1;j<a.length;j++) {
						if(a[j]==3) {
							int temp = a[j+1];
							a[j+1]=a[index];
							a[index]=temp;
						}
					}	
				}
				else
				{
					for(int j=i+1;j<a.length;j++) {
						if(a[j]==3) {
							int temp = a[j];
							a[j]=a[index];
							a[index]=temp;
						}
					}	
				}
			}
		}
		return a;
	}

}
