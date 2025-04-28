//  Calculate the sum of all elements in an array.

public class question13 {
    public static void main(String[] args) {
        int[] arr = {22, 34, 45, 26, 56};
        int sum = 0;
        for (int element : arr) {
           sum += element;
        }

        System.out.println("sum of the element of the given array is  " + sum);
    }
}



// using stream.sum method in java 8 (modern approach)

// import java.util.Arrays;

// public class question13 {
//     public static void main(String[] args) {
//         int[] arr = {22, 34, 45, 26, 56};
//         int sum = Arrays.stream(arr).sum();
//         System.out.println("Sum of the elements of the given array is " + sum);
//     }
// }
