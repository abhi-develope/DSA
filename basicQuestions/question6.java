//  Take 3 sides of a triangle and check if it's valid or not. 

public class question6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        int c = 5;

        if (a + b > c && b + c > a && c + a > b){
            System.out.println("its a valid traingle");
        }else {
            System.out.println("invalid traingle");
        }
    }
}
