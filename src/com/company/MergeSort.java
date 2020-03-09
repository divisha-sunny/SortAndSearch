package com.company;

public class MergeSort {
     void sort(int arr[], int low, int high){
         if(low < high){
             int middle = (low + high)/2;
             sort(arr, low, middle);
             sort(arr, middle+1, high);

             merge(arr, low, high, middle);
         }
     }
     void merge(int arr[], int low, int high, int middle){
         int n1 = middle-low+1;
         int n2 = high-middle;

         int L[] = new int[n1];
         int R[] = new int[n2];

         for(int i=0; i<n1; i++){
             L[i]=arr[low+i];
         }
         for(int j=0; j<n2; j++){
             R[j]=arr[middle+1+j];
         }
         int i=0, j=0;
         int k=low;
         while(i<n1 && j<n2){
             if(L[i]<=R[j]){
                 arr[k]=L[i];
                 i++;
             }
             else
             {
                arr[k]=R[j];
                j++;
             }
             k++;
         }
         while(i<n1){
             arr[k]=L[i];
             i++;
             k++;
         }
         while(j<n2){
             arr[k]=R[j];
             j++;
             k++;
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



