//  Find the maximum element in an array.

public class question12 {
    public static void main(String[] args) {
        int[] arr = {22, 34, 45, 26, 56};
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        System.out.println("max in the array is " + max);
    }
}
