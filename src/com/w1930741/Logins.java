package com.w1930741;

import java.util.Scanner;

public class Logins {


	public void admin(){

		String userName = "";
		String passWord = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name : ");
		userName = sc.nextLine();
		System.out.println("Enter Password : ");
		passWord = sc.nextLine();

		Admin a = new Admin();

		if(userName.equals("admin")){
			if (passWord.equals("admin")){

			}else{
				System.out.println("failed Password");
			}

			System.out.println("WELCOME TO ADMIN PANEL !!!!!");

			int nm=0;
			do {
				System.out.println("Please select below options : ");
				System.out.println("1 . Add Visitor");
				System.out.println("2 . View Visitor");
				System.out.println("8 . Back");

				nm = sc.nextInt();

				switch (nm) {
					case 1:
						a.addVisitor();
						break;
					case 2:
						a.displayVisitors();
						break;
					case 8:

					default:
						System.out.println("Good bye !!");
				}
			}while (nm != 8);


		}else {
			System.out.println("Failed username OR password");
		}
	}

	public void visitor(){
		

	}


}
