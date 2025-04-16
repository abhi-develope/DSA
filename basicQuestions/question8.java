// Calculate the sum of digits of a number.

import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();
        int temp = Math.abs(number);
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp/=10; 



            
        }
        System.out.println("sum of digits of given number " + sum);
        sc.close();
    }

}
