package com.company.day02.operators;

/**
 *  Unary Arithmetic Operators
 */
public class Example02 {
    public static void main(String[] args) {
        //Unary post-increment
        int x =5;
        int a = x++;// a = 5, x=6
        int b = ++x;// b=7, x =7
        System.out.println(a);
        System.out.println(b);
        int j =5;
        int m = j--;// j =4, m= 5
        int n = --j;// j=3, n =3
        System.out.println(m);
        System.out.println(n);
    }
}
