package org.example.task2_numberNegativeOnItemArr;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        Array array1 = new Array();

        System.out.println(array);
        System.out.println();

        System.out.println("Введите число");
        int z= scanner.nextInt();

        try {
            array1 = array.numnberNegativeOnItemArr(z);
        } catch (ArithmeticException e){
            System.err.println("сброшеное число");
            System.err.println("Проверямое  число");
        }
        System.out.println(array1);
    }
}
