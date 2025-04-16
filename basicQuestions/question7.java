//  Count the number of digits in a given number. 
import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("enter the number");
        int number = sc.nextInt();
        int temp = Math.abs(number);

        if (temp  == 0) {
            System.out.println("number of digits is " + 1);
        }else{
            int count = 0;
            for (int i=temp; i != 0 ; i /= 10){
                     
                        count++;
                     
            }
            System.out.println("number of digits is " + count );
        }
        
        sc.close();
       
    }
}
