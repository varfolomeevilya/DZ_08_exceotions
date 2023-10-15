package org.example.task3_triagle_PlanOnItem;

public class Triagle {
    private int[] edges;

    //    private int randSize;
    public Triagle() {
        int randSize = (int) (Math.random() * 10);
        this.edges = new int[randSize];
        initArray(randSize);
    }

    public Triagle(int randSize) {
        this.edges = new int[randSize];
        initArray(randSize);
    }
   public void initArray(int randSize){
        for(int i=0; i< randSize; i++){
            this.edges[i]= (int) (Math.random()* 20);
        }
   }
    Triagle triagle_PlanOnItem(int number) {
        Triagle newTriagle = new Triagle(this.edges.length);
        for (int i = 0; i < this.edges.length; i++) {
            if (i > 100) {
                return newTriagle;
            } else {
                return newTriagle;
            }
        }
        return newTriagle;
    }

    @Override
    public String toString() {
        String str= "";
        for(int res : this.edges){
            str+= res + "*";
        }
        return str;
    }
}
