package com.company.sort;

import java.util.ArrayList;

public class Sort {
    void bubbleSort(int arr[]) {
        //Time-O(n^2)
        //Space - O(1)
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }
    void insertionSort(int arr[]){
        // Time -O(n^2)
        // Space - O(1)
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]);

        }
    }
}

