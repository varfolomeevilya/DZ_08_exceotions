package org.example.task4_binarySearchItemArr;

import java.util.Arrays;

public class MyArray {
    private int[] array;

    //    private int randSize;
    public MyArray() {
        int randSize = (int) (Math.random() * 10+1);
        this.array = new int[randSize];
        initArray(randSize);
    }

    public MyArray(int randSize) {
        this.array = new int[randSize];
        initArray(randSize);
    }

    public void initArray(int randSize) {
        for (int i = 0; i < randSize; i++) {
            this.array[i] = (int) (Math.random() * 20-10);
        }
    }

    public MyArray binarySearchItemArr(int number) {
        MyArray newMyArray = new MyArray(this.array.length);
        Arrays.sort(array);
        for (int i = 0; i < this.array.length; i++) {
            if (number > 120) {
                return newMyArray;
            } else {
                return newMyArray;
            }
        }
        return newMyArray;
    }

    @Override
    public String toString() {
        String str = "";
        for (int res : this.array) {
            str += res + " ";
        }
        return str;
    }
}
