import java.util.Scanner;

public class NumberReversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four digit number: ");
        int number = sc.nextInt();

        int first_digit = number % 10;
        int second_digit = (number/10)%10;
        int third_digit = (number/100)%10;
        int fourth_digit = (number/1000)%10;
        int reversed_number = ((first_digit*1000)+(second_digit*100)+(third_digit*10)+(fourth_digit*1));
        System.out.println(reversed_number);
    }
}
