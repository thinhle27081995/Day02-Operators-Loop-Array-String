package com.company.day02.java_arrays.example01;

public class ArrayTutorials {
    public static int[] reverseArray(int[] input){
        int[] reverse = new int[input.length];
        for (int i=0,j=reverse.length-1;i<input.length;i++,j--){
            reverse[j]=input[i];
        }
        return reverse;
    }
    public static void display(int[] input){
        for(int counter =0; counter<input.length;counter++){
            System.out.print(input[counter]+"\t");
        }
    }
    public static void main(String[] args) {
        int[] marks ={22,66,33,99,88,77};
        //show marks
        display(marks);

        //Reverse array element
        int[] revmarks;
        revmarks= reverseArray(marks);
        System.out.println("\nReverse array element: ");
        display(revmarks);
    }
}
