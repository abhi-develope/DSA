class Solution {

    void PrintNameUpToN(int N) {
        // code here
        if(N < 1){
            return;
        }
        
        PrintNameUpToN(N-1);
        System.out.print("GFG" + " ");
    }
}