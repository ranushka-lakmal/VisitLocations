package com.w1930741;

import java.util.Scanner;

public class Visitor {


	public void printVisitorMenu(){
		int select;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please Select Below Options : ");
			System.out.println("1 : Theater ");
			System.out.println("2 : Park ");
			System.out.println("3 : Museum ");
			System.out.println("4 : EXIT");
			select = sc.nextInt();

			Places p = new Places();


			switch (select) {
				case 1:
					p.print();
					break;
				case 2:
					//need to crete visitor login

					/* p.print();*/
					break;
				case 4:
					System.out.println("Good Bye");
					break;
				default:
					System.out.println("invalid input");
			}
		}while (select != 4);
	}

}
