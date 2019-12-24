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
      
    public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    } 
    
    public int interpolationSearch(int arr[], int n, int x) 
    { 
    // Find indexes of two corners 
    int lo = 0, hi = (n - 1); 
  
    // Since array is sorted, an element present 
    // in array must be in range defined by corner 
    while (lo <= hi && x >= arr[lo] && x <= arr[hi]) 
    { 
        if (lo == hi) 
        { 
            if (arr[lo] == x) return lo; 
            return -1; 
        } 
        // Probing the position with keeping 
        // uniform distribution in mind. 
        int pos = (int) (lo + (((double)(hi - lo) / 
                (arr[hi] - arr[lo])) * (x - arr[lo]))); 
  
        // Condition of target found 
        if (arr[pos] == x) 
            return pos; 
  
        // If x is larger, x is in upper part 
        if (arr[pos] < x) 
            lo = pos + 1; 
  
        // If x is smaller, x is in the lower part 
        else
            hi = pos - 1; 
    } 
    return -1; 
}
    
    public int jumpSearch(int arr[], int x, int n) 
    { 
    // Finding block size to be jumped 
        double step = sqrt(n); 
  
    // Finding the block where element is 
    // present (if it is present) 
    int prev = 0; 
    while (arr[min(step, n)-1] < x) 
    { 
        prev = (int) step; 
        step += sqrt(n); 
        if (prev >= n) 
            return -1; 
    } 
  
    // Doing a linear search for x in block 
    // beginning with prev. 
    while (arr[prev] < x) 
    { 
        prev++; 
  
        // If we reached next block or end of 
        // array, element is not present. 
        if (prev == min(step, n)) 
            return -1; 
    } 
    // If element is found 
    if (arr[prev] == x) 
        return prev; 
  
    return -1; 
} 

    private int min(double step, int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
}    

