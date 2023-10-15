package org.example.task2_numberNegativeOnItemArr;

public class Array {
    private int[] arr;
    //    private int randSize;
    public Array(){
        int randSize = (int) (Math.random()*120 + 1);
        this.arr= new int[randSize];
        initArray(randSize);
    }
    public Array(int randSize){
        this.arr= new int[randSize];
        initArray(randSize);
    }
    public void initArray(int randSize){
        for(int i=0; i<randSize; i++){
            this.arr[i]= (int) (Math.random()* 100 - 10);
        }
    }
    public Array numnberNegativeOnItemArr(int number){
        Array newArray= new Array(this.arr.length);
        for(int i=0; i<this.arr.length; i++){
            if(i > 100){
                return newArray;
            }else {
                return newArray;
            }
        }
        return newArray;
    }

    @Override
    public String toString() {
        String str="";
        for( int res : this.arr){
            str+=res + " ";
        }
        return str;
    }
}
