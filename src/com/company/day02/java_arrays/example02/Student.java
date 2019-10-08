package com.company.day02.java_arrays.example02;

import java.util.Scanner;

public class Student {
    private String hoTen;
    private byte tuoi;
    private String gioiTinh;
    private Subject subjects[];

    public Student() {
        subjects = new Subject[3];
    }

    public Student(String hoTen, byte tuoi, String gioiTinh, Subject[] subjects) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.subjects = subjects;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void inputSubject(Scanner scanner){
       for (int i=0; i<subjects.length;i++){
           System.out.println("Enter subject "+(i+1)+" : ");
           subjects[i]= new Subject();
           System.out.print("Name: ");
           subjects[i].setNameSubject(scanner.nextLine());
           System.out.print("Factor: ");
           subjects[i].setFactorSubject(scanner.nextDouble());
           System.out.print("Point: ");
           subjects[i].setPoint(scanner.nextDouble());
           scanner.nextLine();
       }

    }
    public void showSubject(){
        for (int i=0; i<subjects.length;i++){
            System.out.println("Name subject: "+subjects[i].getNameSubject());
            System.out.println("Factor subject: "+subjects[i].getFactorSubject());
            System.out.println("Point subject: "+subjects[i].getPoint());
        }
    }
    public double mark(){
        double sum =0;
        double factor =0;
        double sumFacPon=0;
        for (int i=0; i<subjects.length;i++){
            factor+=subjects[i].getFactorSubject();
            sumFacPon+=(subjects[i].getFactorSubject()* subjects[i].getPoint());
            sum = sumFacPon/factor;
        }
        return sum;
    }
}
