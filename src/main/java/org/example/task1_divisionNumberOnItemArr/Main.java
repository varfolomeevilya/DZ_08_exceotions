package org.example.task1_divisionNumberOnItemArr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArray myArray = new MyArray();
        MyArray myArray1 = null;

        System.out.println(myArray);
        System.out.println();

        System.out.println("Введите число");
        int j= scanner.nextInt();

        try {
            myArray1 = myArray.divisionOnItemArray(j);
        }catch (ArithmeticException e){
            System.err.println("Деление на ноль");
        }
        System.out.println(myArray1);
    }
}
