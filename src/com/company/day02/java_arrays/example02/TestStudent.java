package com.company.day02.java_arrays.example02;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        Scanner scanner = new Scanner(System.in);

        managerStudent.input(scanner);
        managerStudent.showStudent();
        System.out.println("Mark Student: "+managerStudent.sumMarkStudent());
    }
}
