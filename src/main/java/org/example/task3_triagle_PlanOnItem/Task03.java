package org.example.task3_triagle_PlanOnItem;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Triagle triagle = new Triagle();
        Triagle triagle1 = null;

        System.out.println(triagle);
        System.out.println();

        System.out.println("Веедите длину ребер");
        int i= scanner.nextInt();

        try {
            triagle1 = triagle.triagle_PlanOnItem(i);
        }catch (ArithmeticException e){
            System.err.println("Создается треугольника");
            System.err.println("Сброшен треугольник");
        }
        System.out.println(triagle1);
    }
}
