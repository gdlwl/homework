package com.lwl.strategy.example;

import java.util.Arrays;

public class InsertionStrategy implements  Strategy {
    /**
     * 插入排序
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {
        int preIndex;
        int current;
        for(int i=1; i<arr.length; i++){
            preIndex = i-1;
            current = arr[i];
            while(preIndex>=0 &&arr[preIndex]>current){
                arr[preIndex+1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex+1] = current;
        }
        System.out.println("插入排序: "+Arrays.toString(arr));
        return arr;
    }
}
