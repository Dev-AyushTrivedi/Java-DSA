import java.util.*;

public class Practice1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b;
        int product = a * b;
        System.out.println("Sum of a and b = " + sum + " and product = " + product);
    }
}
