package com.company.search;

import com.company.quickSort;

public class kthSmallestElement {

    public int kthSmallest(int arr[], int l, int r, int k){
        quickSort qs = new quickSort();
        qs.sort(arr,l,r);
        return arr[k-1];
    }
}
