// Swap two numbers (without using a third variable).

public class question3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swapping value of a is" + a +  "and b is" + b);

         a = a + b;
         b = a - b;
         a = a - b;

         System.out.println("after swapping swapping value of a is" + a +  "and b is" + b);



        
    }
}
