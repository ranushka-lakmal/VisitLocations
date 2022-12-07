package com.w1930741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException,RuntimeException{

        int select;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select Below Options : ");
        System.out.println("1 : ADMIN ");
        System.out.println("2 : VISITOR ");
        System.out.println("4 : EXIT ");
        select = sc.nextInt();
        Logins l = new Logins();
        Places p = new Places();

        do {
            switch (select) {
                case 1:
                    l.admin();
                    break;
                case 2:
                    p.print();
                    break;
                default:
                    System.out.println("invalid input");
            }
        }while (select != 4);
    }
}
