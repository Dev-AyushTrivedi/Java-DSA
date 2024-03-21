import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Total Marks: " + (a+b+c) + "\nand Percentage: " + (a+b+c)/3 );
    }
}
