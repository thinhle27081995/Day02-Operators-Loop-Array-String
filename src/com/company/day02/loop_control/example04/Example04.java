package com.company.day02.loop_control.example04;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        int n;
        String binarystring ="";
        int remain,result;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter n in [100-200]: ");
            n= scanner.nextInt();
        }while (n<100||n>200);
        do {
            result=n/2;
            remain = n%2;
            binarystring =remain+binarystring;
            n= result;
        }while (result!=0);
        System.out.println("Binary number: "+binarystring);
    }
}