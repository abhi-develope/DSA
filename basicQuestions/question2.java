// 2. Input two numbers and print their sum, difference, product, and quotient. 

// import java.util.Scanner;

// public class question2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number 1");
//         float num1 = sc.nextFloat();

//         System.out.println("Enter number 2");
//         float num2 = sc.nextFloat();

//         float sum = num1 + num2;
//         float difference = num1 - num2;
//         float multiplication = num1 * num2;
//         float division = num1/num2;

//         System.out.println("sum is " + sum);
//         System.out.println("difference is " + difference);
//         System.out.println("multiplication is " + multiplication);
//         System.out.println("division is " + division);

//         sc.close();
//     }
    
// }

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter number 2: ");
        float num2 = sc.nextFloat();

        System.out.printf("Sum: %.2f\n", num1 + num2);
        System.out.printf("Difference: %.2f\n", num1 - num2);
        System.out.printf("Multiplication: %.2f\n", num1 * num2);
        
        if (num2 != 0) {
            System.out.printf("Division: %.2f\n", num1 / num2);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        sc.close();
    }
}

