package com.lwl.strategy.example;

import java.util.Arrays;

public class BubbleSortStrategy implements Strategy{
    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("冒泡排序: "+Arrays.toString(arr));
        return arr;
    }
}
