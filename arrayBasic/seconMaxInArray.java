// Find the second largest element in an array. 

public class seconMaxInArray {
    public static void main(String[] args) {
        int arr[] = {34,67,37, 20,24};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
       for (int num : arr) {
          if(num > max1){
               max2 = max1;
               max1 = num;
          }else if(num > max2 && num != max1){
            max2 = num;
          }
       }

       System.out.println("second maximum number: " + max2);
    }
}
