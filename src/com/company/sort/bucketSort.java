package com.company.sort;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class bucketSort {
    //When we have have large set of data uniformly distributed across the range, we can simply apply comparision based sorting algorithm but the cannot do better than nLogn. To sort them in linear time we use bucket sort.
    quickSort qs = new quickSort();

    public int hash(int value) {
        return (value / 10);
    }

    public void sortUsingBucketSort(int arr[], int n) {

        List<Integer>[] buckets = new List[n];
        // list for storing numbers in each bucket
        for (int i = 0; i < n; i++) {
            buckets[i] = new LinkedList<>();
        }
        //Assigning the numbers of array to the proper bucket
        for (int num : arr) {
            int h = hash(arr[num]);
            buckets[h].add(num);
        }
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int i = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[i++] = num;
            }
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
}
