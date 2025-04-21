//  Check whether a number is an Armstrong number.

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check for armstrong number");

        int number = sc.nextInt();
        int expontial = Integer.toString(number).length();
        System.out.println("expontial " + expontial);
        int sum = 0;

    for (int i=number; i>0 ; i/=10){
           int digit = i % 10;
           sum += Math.pow(digit, expontial);
    }
    System.out.println(sum);

    if(sum == number){
        System.out.println("the number is armstrong number");
    }else{
        System.out.println("not a armstrong number");
    }

    sc.close();

    
    }
}
