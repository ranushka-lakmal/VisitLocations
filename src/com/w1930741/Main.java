package com.w1930741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException,RuntimeException{

        int select;
        Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Please Select Below Options : ");
        System.out.println("1 : ADMIN ");
        System.out.println("2 : VISITOR ");
        System.out.println("4 : EXIT ");
        select = sc.nextInt();
        Logins l = new Logins();
        Places p = new Places();


            switch (select) {
                case 1:
                    l.admin();
                    break;
                case 2:
                    //need to crete visitor login
                    l.visitor();
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
