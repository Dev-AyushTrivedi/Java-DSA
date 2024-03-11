import java.util.Scanner;

public class Greatest_Number{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a = input.nextInt();

        System.out.println("Enter value of b : ");
        int b = input.nextInt();

        if(a>b){
            System.out.println("A is greatest Number = " + a);
        }else{
            System.out.println("B is greatest Number = " + b);
        }
    }
}