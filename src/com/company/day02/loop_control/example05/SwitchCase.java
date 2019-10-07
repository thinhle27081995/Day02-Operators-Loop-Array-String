package com.company.day02.loop_control.example05;

import java.util.Scanner;

public class SwitchCase {
    static void menu() {
        System.out.println(" Menu Calculator ");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("5. Exit ");
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        do {
            menu();
            System.out.println("Enter n: ");
            n = scanner.nextInt();

            System.out.println("Enter number a: ");
            int a = scanner.nextInt();
            System.out.println("Enter number b: ");
            int b = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println(" Addition: " + (a + b));
                    break;
                case 2:
                    System.out.println(" Subtraction : " + (a - b));
                    break;
                case 3:
                    System.out.println(" Multiplication : " + (a * b));
                    break;
                case 4:
                    System.out.println(" Division : " + (a / b));
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (n!=0||n<6);
    }
}
