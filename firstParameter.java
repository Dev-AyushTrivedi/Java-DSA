import java.util.Scanner;

public class firstParameter {
    public static void calculateSum(int num1, int num2){
        int Sum = num1 + num2;
        System.out.println("Sum is = " + Sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
