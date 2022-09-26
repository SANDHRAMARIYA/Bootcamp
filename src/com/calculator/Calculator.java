package com.calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        int choice;
        while (true) {
            System.out.println("1. Add");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            System.out.println("Enter the operands");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    System.out.println(a/b);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}