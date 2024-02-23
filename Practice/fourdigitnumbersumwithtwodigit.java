import java.util.Scanner;

public class fourdigitnumbersumwithtwodigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int number = input.nextInt();

        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        thousands = (thousands + 2) % 10;
        hundreds = (hundreds + 2) % 10;
        tens = (tens + 2) % 10;
        ones = (ones + 2) % 10;

        int newNumber = thousands * 1000 + hundreds * 100 + tens * 10 + ones;
        System.out.println("The new number is " + newNumber);
    }
}
