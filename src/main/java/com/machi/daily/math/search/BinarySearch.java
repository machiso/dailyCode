package com.machi.daily.math.search;


//二分查找
public class BinarySearch {

    /**
     * 基于递推二分查找
     * @param arr
     * @param min
     * @param max
     * @param val
     * @return
     */
    public int binarySearch(int[] arr,int min,int max,int val){
        int mid = (min+max)/2;
        if (val == arr[mid]) return mid;
        if (arr[mid]>val){
            return binarySearch(arr,min,mid,val);
        }else {
            return binarySearch(arr,mid,max,val);
        }
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {2,4,12,34,42,45,65,76,96,321};
        System.out.println(search.binarySearch(arr, 0, arr.length, 96));
    }
}
