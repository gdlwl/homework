package com.lwl.strategy.example;

import java.util.Arrays;

public class SelectionSortStrategy implements  Strategy{
    /**
     * 选择排序(选最大)
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {
        int len = arr.length;
        int maxIndex = 0;
        int temp;
        for(int i=0; i<len-1; i++){
            maxIndex = i;
            for(int j=i;j<len-1; j++){
                if(arr[maxIndex]<arr[j+1]){
                    maxIndex = j+1;
                }
            }
            temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println("选择排序: "+Arrays.toString(arr));
        return arr;
    }
}
