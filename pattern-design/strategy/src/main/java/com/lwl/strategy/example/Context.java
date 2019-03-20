package com.lwl.strategy.example;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int[] arr){
         return strategy.sort(arr);
     };
}
