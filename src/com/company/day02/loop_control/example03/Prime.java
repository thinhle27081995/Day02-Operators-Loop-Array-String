package com.company.day02.loop_control.example03;

import java.util.Scanner;

/**
 *  Find prime number from 2 to 200
 */

public class Prime {
    static boolean checkPrime(int n){
        if (n<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n need check for number: ");
        int n = scanner.nextInt();
        for (int i=2;i<=n;i++){
            if (checkPrime(i)){
                System.out.println(i+"\t");
            }
        }
    }
}
