package com.company.search;

public class BinarySearch {

    public int binarySearch(int arr[],int l, int r, int x){
        //Its better to use binary search on sorted array. For unsorted array linear is faster.
        int n=arr.length;
        if(r >= l){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                return binarySearch(arr, l, mid-1, x);
            }
            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
