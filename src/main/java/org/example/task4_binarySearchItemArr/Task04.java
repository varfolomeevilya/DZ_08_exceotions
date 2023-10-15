package org.example.task4_binarySearchItemArr;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MyArray myArray = new MyArray();
        MyArray myArray1= null;

        System.out.println(myArray);
        System.out.println();

        System.out.println("Введите число");
        int i= scanner.nextInt();
        try {
           myArray1 = myArray.binarySearchItemArr(i);
        }catch (ArithmeticException e){
            System.err.println("Неотсортирован массив");
            System.err.println("бросить проверямое исключения");
        }
        System.out.println(myArray1);
    }
}
