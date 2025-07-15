package gfg.array;

import java.util.Arrays;

public class ThreeGreatCandidate {
	 int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
         Arrays.sort(arr);
         
         // if all are positive
         int maxProduct1 = arr[n-1]*arr[n-2]*arr[n-3];

         //if there is negative integer in array
         int maxProduct2 = arr[0]*arr[1]*arr[n-1];
   
   return Math.max(maxProduct1, maxProduct2);
    }
}
