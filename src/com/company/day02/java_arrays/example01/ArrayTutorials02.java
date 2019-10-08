package com.company.day02.java_arrays.example01;
// Search for the number 1 in a set of integers
// This search takes place in main.
// This search could also have been placed in a method.
public class ArrayTutorials02 {
    public static void main(String[] args) {
        int[] numbers ={1,2,3,5,6,7,99,88,20};
        int key =1;
        int i;
        boolean found =false;
        for (i=0;i<numbers.length;i++){
            if (numbers[i]==key){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("Found of "+key+" at index "+i+"");
        }else {
            System.out.println(key+" is not in this array.");
        }
    }
}
