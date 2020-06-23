package com.machi.daily.math.sort;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort search = new BubbleSort();
        int[] arr = {23,12,32,3,5,67,36,76,86,342,2342};
        for (int i : search.bubbleSort(arr)) {
            System.out.println(i);
        }
    }
}
