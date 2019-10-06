package com.company.day02.loop_control.example01;

import java.util.Scanner;

public class LoopFor_Sum {
    private int n;

    private Scanner scanner = new Scanner(System.in);
    public void input(){
        System.out.println("Enter n: ");
        n = scanner.nextInt();
    }
    public int sumEven(){
        int sum =0;
        for (int i=0; i<n;i++){
            if (i%2==0 && i%3!=0){
                System.out.println("\t"+i);
                sum+=i;
            }
        }
        return sum;
    }
    public void show(){
        System.out.println("n = "+n);
        System.out.println("Sum = "+sumEven());
    }

}
