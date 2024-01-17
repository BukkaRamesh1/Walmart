package com.walmart.util;

import java.util.Scanner;

import com.walmart.dao.Product;

public class Sample {

	/*
	 * 
	 * 
	 * 1. we need our reporsiory -- walmart 2. you need to clone the code -- the
	 * ways to clone the code is via eclipse or use git bash shell
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Git commands to perform operations ***
	 * 
	 * git clone https:// cd Walmart/ git branch -- what's your current branch is
	 * git checkout -b feature/xyz -- create new branch git add filepath -- it will
	 * add the changes to git git commit -m "replace me" -- to cmmit the code git
	 * push -u origin feature/ramesh git pull -- will fetch all the latest code from
	 * repo
	 * 
	 * 
	 * Rachana-have committed latest code.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Product p = null;
		Scanner scanner = new Scanner(System.in);

		
		boolean exit = false;

		while (!exit) {
			System.out.println("Enter the product option (1-2) or 0 to exit:\n");
			System.out.println("1. Add New Product\n");
			System.out.println("2. Display Info\n");
			int option = scanner.nextInt();
			switch (option) {
			case 1:

				p = new Product(new Ops().id(), "Onions", 2.76, 30);
				System.out.println("Product Added");
				break;

			case 2:
				p.displayProductInfo();
				break;

			case 3:
				System.out.println("You selected Option 3: Product C");
				// Add code for handling Option 3
				break;
				
			case 0:
                System.out.println("Exiting program. Goodbye!");
                exit = true;
                break;

			default:
				System.out.println("Invalid option. Please select a valid option.");
				// Add code for handling invalid options
				break;
			}
		}
		scanner.close();

	}

}
