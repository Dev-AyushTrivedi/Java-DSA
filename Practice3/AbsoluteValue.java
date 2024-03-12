import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Value : ");
        int value = sc.nextInt();

        if(value<0){
            System.out.println("The Absolute value of " + value + " is " + (-1*value));
        }else{
            System.out.println("The Absolute value of " + value + " is " + value);
        }
    }
}
