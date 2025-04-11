import java.util.Scanner;

// 1. Write a program to take your name and age as input and print it. 


public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking name input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Printing the result
        System.out.println("Your name is " + name + " and your age is " + age);

        scanner.close();
    }
}
