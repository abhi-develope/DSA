package gfg.array;

public class MaxConsecutiveBit {
    public int maxConsecBits(int[] arr) {
        // code here
        int count1 = 0;
        int count0 = 0;
        int maxCount0 = 0;
        int maxCount1 = 0;
        
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 0){
                count0++;
                count1 = 0;
            }else{
                count1++;
                count0 = 0;
            }
        maxCount0 = Math.max(maxCount0, count0);
        maxCount1 = Math.max(maxCount1, count1);
        }
    return Math.max(maxCount0, maxCount1);
    }
}



// another method in which using one maxCount variable
// class MaxConsecutiveBit {
//     public int maxConsecBits(int[] arr) {
//         int count = 0, maxCount = 0;
//         int prev = -1;

//         for (int num : arr) {
//             if (num == prev) {
//                 count++;
//             } else {
//                 count = 1;
//                 prev = num;
//             }
//             maxCount = Math.max(maxCount, count);
//         }

//         return maxCount;
//     }
// }

