package com.company.day02.java_arrays.example01;

import java.util.Scanner;

public class ArrayTutorials03 {
    public static int search(String []list, String key){
        int i, count =0;
        for (i=0; i< list.length;i++){
            if (list[i].equals(key)){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key ="Thinh";//Name need search
        String[] list = new String[2];
        //Enter array
        for (int i=0;i<list.length;i++){
            System.out.println("Enter name "+(i+1)+": ");
            System.out.println("Enter name ");
            list[i]=scanner.nextLine();
        }
        int count = search(list,key);
        System.out.println("Count= "+count);//Display count index find it.

    }
}
