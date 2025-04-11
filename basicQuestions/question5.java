// Check if a year is a leap year

import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the year to find whetever it is leap year or not");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println("the given year is leap year");
        }else{
            System.out.println("not a leap year");
        }

        sc.close();
    }
}
