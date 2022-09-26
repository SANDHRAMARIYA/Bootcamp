package com.employee;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add Employee Selected");
                    break;
                case 2:
                    System.out.println("View Employee Selected");
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}