package com.company.day02.operators;

/**
 *  Relational Operators In Java
 */
public class Example05 {
    public static void main(String[] args) {
        // ==, !=, > , < , >=, <=
        //==
        String string1 ="Thinh";
        String string2 ="Thinh";
        if (string1 == string2){
            System.out.println("Like!");
        }else {
            System.out.println("Not like!");
        }
        //!=
        int a =10;
        int b = 20;
        if (a!=b){
            System.out.println("a difference b");
            if (a<b){
                System.out.println(b);
            }
        }else {
            System.out.println("a like b!");
        }
        //Ternary Operator(?)
        int k =10;
        int l =15;
        boolean check = (k>l)?true:false;
        if (check){
            System.out.println(k);
        }else {
            System.out.println(l);
        }

    }
}
