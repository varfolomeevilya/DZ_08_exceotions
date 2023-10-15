package org.example.task5_methodHalt;

import org.example.task5_methodHalt.method.Runner;

import java.io.IOException;

public class Task05 {
    public static void main(String[] args){
        Runner runner = new Runner();
        try {
            runner.halt();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
