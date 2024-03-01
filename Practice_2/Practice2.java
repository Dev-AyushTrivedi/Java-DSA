import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition of two numbers: " + (num1+num2));
        System.out.println("Subtraction of two numbers: " + (num1-num2));
        System.out.println("Multiplication of two numbers: " + (num1*num2));
        System.out.println("Divide of two numbers: " + (num1/num2));
        System.out.println("Module of two numbers: " + (num1%num2));
    }
}
