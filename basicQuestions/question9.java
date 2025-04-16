//  Find factorial of a number using loop.

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        int factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = num; i >= 1; i--) {
                factorial *= i;
            }
            System.out.println("Factorial of the given number is " + factorial);
        }

        sc.close();
    }
}
