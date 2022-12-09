package com.w1930741;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Logins {

	String username = "";
	String password = "";

	String filePath = "C:\\Users\\ranus\\Desktop\\myProject\\visitor.txt";
	private static Scanner x;

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

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter visitor username : ");
		username = sc.nextLine();
		System.out.println("Please enter visitor password : ");
		password = sc.nextLine();

		verfyLogin(username, password, filePath);

	}


	public void verfyLogin(String username, String password, String filePath){

		boolean found = false;
		String tempUsername = "";
		String tempPassword = "";

		Places p = new Places();

		try{
			x = new Scanner(new File(filePath));
			x.useDelimiter("[,\n]");

			while (x.hasNext() && !found){
				tempUsername = x.next();
				tempPassword = x.next();

				if(tempUsername.trim().equals(username) && tempPassword.trim().equals(password)){
					found = true;
					System.out.println("Successful login");
					p.print();
				}
			}
			x.close();

		}catch (Exception e){

			System.out.println("Error \n"+ e);
		}
	}


}
