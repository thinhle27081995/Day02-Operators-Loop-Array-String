package com.company.day02.loop_control.example02;

/**
 *  Show in number
 *  1
 *  1 2
 *  1 2 3
 *  1 2 3 4
 *  1 2 3 4 5
 */

public class Triangle {
    public static void main(String[] args) {
        for (int i=1;i<=5; i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
