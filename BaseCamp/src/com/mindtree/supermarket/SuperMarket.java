package com.mindtree.supermarket;

import java.util.Scanner;

public class SuperMarket {
	
	static int i=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		

		boolean flag = true; int c=0,n=0,m=0; float bill_amount=0;
		
		Item[] items = new Item[n];
		Customer[] customers = new Customer[100];
		
		
		while(flag)
		{

			do {
				System.out.println("1. Add item\n2. Add mobile no\n3. Total bill amounte\n"
						+ "4. Most sold item\n5. Most valued customer");
				if(sc.hasNextInt()) {

					c=sc.nextInt();
					sc.nextLine();
				}
				else {
					sc.nextLine();
					System.out.println("Invalid input");
				}
			}while(c<=0 && c>6);
			
			SuperMarket obj = new SuperMarket();
			
			switch(c)
			{
			
			case 1: bill_amount+= obj.add(items); break;
			
			case 2: obj.set_no(customers); break;
			
			case 3: customers[i].setBill_amount(bill_amount); 
					System.out.println("Total bill: "+customers[i].getBill_amount()); i++; break;
			
			case 4:Item item = obj.most_sold_item(items); System.out.println(item); break;
			
			case 5: System.out.println("Most valued customer: "+ obj.most_valued_customer(customers)); break;
			}


		}
	}
	
	private float  add(Item[] items) {
		
		Scanner sc = new Scanner(System.in);
		float price=0;
		System.out.println("Enter item code");
		String s = sc.next();
		for(int i=0;i<items.length;i++) {
			
		
			if(s.equals(items[i].getCode()))
			{
				System.out.println("Enter quantity");
				int q=sc.nextInt();
				items[i].setCount(q);
				
				System.out.println("Discount percent");
				int ids_per=sc.nextInt();
				price = items[i].getPrice()*q-(items[i].getPrice()*q*ids_per)/100;
				break;
			}
			else {
				System.out.println("Incorrect item code entered");
			}
				
		}
		
		return price;
	}

	private void set_no(Customer[] customers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile no");
		customers[i].setPhone_no(sc.nextInt());
	}

	private Item most_sold_item(Item[] item) {
		
		int index=0,max=0;
		
		for(int i=0;i<item.length;i++) {
			if(item[i].getCount()>max)
			{
				max=item[i].getCount();
				index=i;
			}
		}
		
		return item[i];
		
	}

	private Customer most_valued_customer(Customer[] customers) {
		
		float max=0;
		int index=0;
		
		for(int i=0;i<customers.length;i++) {
			if(customers[i].getBill_amount()>max)
			{
				max=customers[i].getBill_amount();
				index=i;
			}
		}
		
		return customers[i];
	}

}
