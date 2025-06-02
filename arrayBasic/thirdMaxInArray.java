
//  Find the Third Largest Element in an Array

public class thirdMaxInArray {
    public static void main(String[] args) {
        int arr[] = {12, 1, 67, 45, 89, 23};  // Expected: 67

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element > max1) {
                max3 = max2;
                max2 = max1;
                max1 = element;
            } else if (element > max2 && element != max1) {
                max3 = max2;
                max2 = element;
            } else if (element > max3 && element != max1 && element != max2) {
                max3 = element;
            }
        }

        System.out.println("Third highest number is: " + max3);
    }
}
