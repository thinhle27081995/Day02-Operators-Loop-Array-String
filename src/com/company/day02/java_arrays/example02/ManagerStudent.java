package com.company.day02.java_arrays.example02;

import java.util.Scanner;

public class ManagerStudent {
    private Student student[];

    public ManagerStudent() {
        student = new Student[5];
    }
    public void input(Scanner scanner){
        for (int i=0;i<student.length;i++){
            System.out.println("Enter student "+(i+1)+" : ");
            student[i]=new Student();
            System.out.println("Enter name: ");
            student[i].setHoTen(scanner.nextLine());
            System.out.println("Enter age: ");
            student[i].setTuoi(scanner.nextByte());
            scanner.nextLine();
            System.out.println("Enter gender: ");
            student[i].setGioiTinh(scanner.nextLine());
            System.out.println("Enter info subject: ");
            student[i].inputSubject(scanner);
        }
//        scanner.nextLine();
    }
    public void showStudent(){
        for (int i=0; i<student.length;i++){
            System.out.println("Show student: "+(i+1)+":");
            System.out.println("Name: "+student[i].getHoTen());
            System.out.println("Age: "+student[i].getTuoi());
            System.out.println("Gender: "+student[i].getGioiTinh());
            System.out.println(" Subject ");
            student[i].showSubject();
            System.out.println("Mark "+student[i].mark());
        }
    }

    public double sumMarkStudent(){
        double sumMarkStudent =0;
        for (int i=0; i<student.length;i++){
            sumMarkStudent += student[i].mark();
        }
        sumMarkStudent = sumMarkStudent/5;
        return sumMarkStudent;
    }
}
