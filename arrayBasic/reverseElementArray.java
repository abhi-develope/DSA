// Reverse the elements of an array. 

import java.util.Arrays;

public class reverseElementArray {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 5, 6, 7};
        int arr2[] = new int[arr1.length]; // allocate correct size

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length - 1 - i]; // reverse
        }

        System.out.println("arr2: " + Arrays.toString(arr2)); // proper array print
    }
}