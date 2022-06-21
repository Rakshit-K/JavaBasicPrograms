package com.bitroute.demo1;

import java.util.Scanner;

public class BasicProgramUsingScannerAndPrinter {

	public static void main(String[] args) {
		//program to calculate cost of order based on input parameters
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the food item name");
		String foodItem = sc.next();
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		System.out.println("Enter the customer type");
		String customerType = sc.next();
		
		int unitPrice = 10;
		int totalCost =  unitPrice*quantity;
		
		if(customerType.equalsIgnoreCase("Regular")) {
			totalCost = totalCost-totalCost * 5/100;
			System.out.println("You are a regular customer and eligible for 5% discount");
		}else {
			totalCost = totalCost +5;
			System.out.println("You need to pay an additional delivery charge of $5");
		}
		
		System.out.println("Order successfully placed for "+ foodItem);
		System.out.println("Total cost is: "+ totalCost);

	}

}
