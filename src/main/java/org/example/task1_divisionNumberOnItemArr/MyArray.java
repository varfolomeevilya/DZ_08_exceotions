package org.example.task1_divisionNumberOnItemArr;

public class MyArray {
    private int[] arr;
    //    private int randSize;
    public MyArray(){
        int randSize = (int) (Math.random()* 10+1);
        this.arr = new int[randSize];
        initArray(randSize);
    }
    public MyArray(int randSize){
        this.arr = new int[randSize];
        initArray(randSize);
    }
    public void initArray(int randSize){
        for(int i=0; i< randSize; i++){
            this.arr[i] = (int) (Math.random()*20 - 10);
        }
    }
    public MyArray divisionOnItemArray(int number){
        MyArray newMyArray = new MyArray(this.arr.length);
        for (int i =0; i<this.arr.length; i++){
            newMyArray.arr[i]= number/ this.arr[i];
        }
        return newMyArray;
    }

    @Override
    public String toString() {
        String str="";
        for(int res : this.arr){
            str+= res + " ";
        }
        return str;
    }
}
