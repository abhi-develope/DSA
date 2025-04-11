//  Take two numbers and print whether the first is greater than the second. 

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
    System.out.println("Enter number 1");
         int num1 = sc.nextInt();

         System.out.println("Enter number 2");
         int num2 = sc.nextInt();

         if(num1 > num2){
            System.out.println("bigger no is " + num1);
         }else{
            System.out.println("bigger no is " + num2);
         }

         sc.close();
    }
}
