// Display all numbers entered by user except multiples of 10

import java.util.Scanner;

public class DisplayNumberByContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your Number: ");
            int number = sc.nextInt();

            if (number % 10 == 0){
                continue;
            }
            System.out.println("Number was = " + number);
        } while (true);
    }
}
