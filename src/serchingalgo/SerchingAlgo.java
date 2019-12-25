/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serchingalgo;

import static java.lang.Math.sqrt;

/**
 * @author bhanuka
 */
public class SerchingAlgo {

    public boolean jumpSearch(int[] arr) {
        // do the algo
        return true;
    }


    public int binarySearch(int arr[], int l, int r, int x) {
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not
        // present in array
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public int interpolationSearch(int a[], int n, int key) {
        int low = 0, high = (n - 1);
        while (low <= high && key >= a[low] && key <= a[high]) {
            if (low == high) {

                if (a[high] == key)
                    return 1;

                else
                    return -1;

            }

            int position = low + (((high - low) / (a[high] - a[low])) * (key - a[low]));

            if (a[position] == key) {
                return 1;
            } else if (a[position] < key) {
                low = position + 1;
            } else if (a[position] > key) {
                high = position - 1;
            }
        }

        return -1;
    }

    public int jumpSearch(int array[], int size, int key) {
        int start = 0;
        int end = (int) Math.sqrt(size); //the square root of array length

        while(array[end] <= key && end < size) {
            start = end; //it it is not correct block then shift block
            end += Math.sqrt(size);
            if(end > size - 1)
                end = size; //if right exceeds then bound the range
        }

        for(int i = start; i<end; i++) { //perform linear search in selected block
            if(array[i] == key)
                return i; //the correct position of the key
        }
        return -1;
    }
}    

