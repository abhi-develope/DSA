package twoDArray;

import java.util.Arrays;

public class Initialize2DArray {


    public static void main(String[] args) {
        int[][] arr2d = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9},
        };

        // method 1 of printing 2d array

        // for (int row = 0; row < arr2d.length; row++) {
        //     for (int col = 0; col < arr2d[row].length; col++) {
        //         System.out.print(arr2d[row][col] + " ");
        //     }
        //     System.out.println();
        // }


        // method 2

        //  for (int row = 0; row < arr2d.length; row++) {
        //    System.out.println(Arrays.toString(arr2d[row]));
        // }


        // method 3

        for (int[] arr : arr2d) {
            System.out.println(Arrays.toString(arr));
        }


    }
}


