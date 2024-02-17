import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choices;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.print("Enter the number : ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            } else{
                oddSum += number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

            choices = sc.nextInt();
        } while(choices==1);

        System.out.println("Sum of Even Numbers : " + evenSum);
        System.out.println("Sum of Odd Numbers : " + oddSum);
    }
}
