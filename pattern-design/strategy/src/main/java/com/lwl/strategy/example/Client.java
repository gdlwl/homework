package com.lwl.strategy.example;

public class Client {

    public static void main(String[] args) {
         int[] arr = {21,20,25,23,24,28,26,27};
         Context context = new Context(new BubbleSortStrategy());
         context.sort(arr);
         Context context2 = new Context(new SelectionSortStrategy());
         context2.sort(arr);
        Context context3 = new Context(new InsertionStrategy());
        context3.sort(arr);
    }
}
