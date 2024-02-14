import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your body Tempreature : ");
        double temp = sc.nextDouble();

        if (temp > 100){
            System.out.println("You have Fever");
        }
        else {
            System.out.println("You don't have Fever");
        }
    }
}
