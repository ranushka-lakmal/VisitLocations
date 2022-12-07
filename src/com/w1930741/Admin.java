package com.w1930741;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Admin {

	Scanner sc = new Scanner(System.in);
	HashMap<String, String> Visitor = new HashMap<String, String>();

	public void print(){
		System.out.println("Hi im admin");

	}

	public void addVisitor(){

		String vName = "";
		String vPassWord = "";

		System.out.println("<------------Visitor Adding function------------>");
		System.out.println("Please enter Visitor user name : ");
		vName =  sc.nextLine();

		System.out.println("Please enter Visitor Password : ");
		vPassWord=  sc.nextLine();

		Visitor.put(vName,vPassWord);
	}

	public void displayVisitors(){

		for (String i : Visitor.keySet()) {
			System.out.println("user name :"+i+" "+ "Password is :"+Visitor.get(i));
		}

	}

}
