public class SumOfSeries {
    // User function Template for Java

class Solution {
    
    // from itrative appraoch using for loop
    
    int sumOfSeries(int n) {
    //     // code here
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         sum = sum + (i * i * i);
           
    //     }
        
    //     return sum;
    // }
    
    // from recursive approach using recursion
    
    if(n < 1){
        return 0;
    }
    
    return sumOfSeries(n - 1) + (n * n * n);
    }
}
}
