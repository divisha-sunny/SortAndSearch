package com.company;

import com.company.search.BinarySearch;
import com.company.search.kthSmallestElement;
import com.company.sort.bucketSort;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code
        /*Sort s = new Sort();
        MergeSort m =new MergeSort();
        int n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        m.sort(a,0,n-1);
        System.out.println("Sorted array");
        m.printArray(a);
*/
        int arr[] = {37, 74, 12, 45, 67, 99, 65, 29, 32, 9, 15, 4};
        //int n = arr.length;

       /* quickSort q = new quickSort();
        q.sort(arr, 0, n-1);
        *//*System.out.println("Sorted Array:");
        q.printArray(arr);*//*
        int x = 9;
        BinarySearch b = new BinarySearch();
        int result = b.binarySearch(arr, 0, n-1, x);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:" + result);
        }*/
/*
        kthSmallestElement kse = new kthSmallestElement();
       System.out.println(kse.kthSmallest(arr,0,n-1,4));*/

        bucketSort bs = new bucketSort();
        bs.sortUsingBucketSort(arr,10);
        bs.printArray(arr);
    }
}
