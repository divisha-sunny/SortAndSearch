package com.company.sort;

public class sortedMerge {
static int NA = -1;
public void SortedMerge(int a[], int b[], int n, int m){
    //We will consider which element is larger and then inserting tthat element to end of A.
    int i=n-1;
    int j=m-1;
    int lastIndex = n+m-1;
    while(j>=0){
        if(i>=0 && a[i]>b[j]){
            a[lastIndex] = a[i];
            i--;
        }
        else{
            a[lastIndex] = b[j];
            j--;
        }
        lastIndex--;
    }
}
}
